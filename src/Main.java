import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE RESERVAS DE CITAS MÉDICAS =====\n");

        // Ingreso de datos de la cita
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
        sc.nextLine(); 

        Notifica notificador;

        if (opcion == 1) {
            System.out.print("Ingrese el correo electrónico del paciente: ");
            String email = sc.nextLine();
            notificador = new EmailNotificador(email);
        } else if (opcion == 2) {
            System.out.print("Ingrese el número de teléfono del paciente: ");
            String telefono = sc.nextLine();
            notificador = new SmsNotificador(telefono);
        } else {
            System.out.println("Opción inválida. Se usará correo electrónico por defecto.");
            notificador = new EmailNotificador("correo@ejemplo.com");
        }

        Paciente paciente = new Paciente(nombrePaciente, notificador);

        AppointmentManager gestor = new AppointmentManager();

        gestor.addAppointment(cita);
        gestor.confirmAppointment(cita, paciente);

        System.out.println("\n===== CITA CONFIRMADA EXITOSAMENTE =====");

        sc.close();
    }
}
