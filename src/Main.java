import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE RESERVAS DE CITAS MÉDICAS (Patrones) =====\n");

        System.out.print("Ingrese la fecha de la cita (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Ingrese el nombre del doctor: ");
        String doctor = sc.nextLine();

        Appointment cita = new Appointment(fecha, doctor);

        System.out.print("\nIngrese el nombre del paciente: ");
        String nombrePaciente = sc.nextLine();

        System.out.println("\nSeleccione el método de notificación:");
        System.out.println("1. Correo electrónico");
        System.out.println("2. SMS");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Notifica notificadorBase;
        if (opcion == 2) {
            System.out.print("Ingrese el número de teléfono: ");
            String telefono = sc.nextLine();
            notificadorBase = NotificadorFactory.create(NotificadorFactory.Tipo.SMS, telefono);
        } else {
            System.out.print("Ingrese el correo electrónico: ");
            String email = sc.nextLine();
            notificadorBase = NotificadorFactory.create(NotificadorFactory.Tipo.EMAIL, email);
        }

        // Aplicamos el Decorator para añadir logging al notificador
        Notifica notificadorConLog = new LoggingNotificador(notificadorBase);

        // Creamos el paciente que recibe las notificaciones
        Paciente paciente = new Paciente(nombrePaciente, notificadorConLog);

        // Manager y registro
        AppointmentManager manager = new AppointmentManager();
        manager.addAppointment(cita);

        // Usamos Command para confirmar + notificar
        ConfirmAppointmentCommand cmd = new ConfirmAppointmentCommand(cita, paciente);
        manager.executeCommand(cmd);

        System.out.println("\n===== FIN =====");
        sc.close();
    }
}
