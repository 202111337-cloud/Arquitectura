import java.util.ArrayList;
import java.util.List;

// Manager mantiene la lista de citas y puede ejecutar comandos (Command Pattern)
public class AppointmentManager {
    private List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("🗓️ Cita registrada: " + appointment.getDoctorName() + " el " + appointment.getDate());
    }

    // Método auxiliar para ejecutar un comando
    public void executeCommand(Command cmd) {
        cmd.execute();
    }
}
