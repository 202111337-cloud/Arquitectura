import java.util.ArrayList;
import java.util.List;

// =============================================================
// D: Principio de Inversión de Dependencias (DIP)
// =============================================================

public class AppointmentManager {
    private List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("🗓️ Cita registrada: " + appointment.getDoctorName() + " el " + appointment.getDate());
    }

    public void confirmAppointment(Appointment appointment, Notifica notifier) {
        appointment.confirm();
        notifier.notify("Su cita con el Dr. " + appointment.getDoctorName() + " ha sido confirmada para el " + appointment.getDate());
    }
}
