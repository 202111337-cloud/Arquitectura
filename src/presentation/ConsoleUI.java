package presentation;

import domain.*;
import repository.*;
import service.*;
import java.util.Scanner;

/*
 * Capa de presentación: interacción con el usuario.
 */
public class ConsoleUI {

    Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("===== SISTEMA DE RESERVA DE CITAS =====");

        System.out.print("Fecha de cita: ");
        String fecha = sc.nextLine();

        System.out.print("Doctor: ");
        String doctor = sc.nextLine();

        Appointment cita = new Appointment(fecha, doctor);

        System.out.print("Paciente: ");
        String nombrePaciente = sc.nextLine();

        System.out.println("1. Email  2. SMS");
        int opcion = Integer.parseInt(sc.nextLine());

        Notifica base;
        if (opcion == 1) {
            System.out.print("Correo: ");
            base = NotificadorFactory.create(NotificadorFactory.Tipo.EMAIL, sc.nextLine());
        } else {
            System.out.print("Teléfono: ");
            base = NotificadorFactory.create(NotificadorFactory.Tipo.SMS, sc.nextLine());
        }

        Notifica notificador = new LoggingNotificador(base);
        Paciente paciente = new Paciente(nombrePaciente, notificador);

        AppointmentRepository repo = new InMemoryAppointmentRepository();
        AppointmentService service = new AppointmentService(repo);

        service.register(cita);

        Command cmd = new ConfirmAppointmentCommand(cita, paciente);
        new CommandExecutor().executeCommand(cmd);
    }
}
