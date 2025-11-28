package service;

import domain.Appointment;
import repository.AppointmentRepository;

/*
 * Lógica de negocio central del sistema.
 */
public class AppointmentService {
    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public void register(Appointment appointment) {
        repository.save(appointment);
        System.out.println("🗓️ Cita registrada: " +
                appointment.getDoctorName() + " - " + appointment.getDate());
    }
}
