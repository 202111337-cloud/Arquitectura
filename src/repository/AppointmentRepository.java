package repository;

import domain.Appointment;
import java.util.List;

/*
 * Abstracción de persistencia (DIP)
 */
public interface AppointmentRepository {
    void save(Appointment appointment);
    List<Appointment> findAll();
}
