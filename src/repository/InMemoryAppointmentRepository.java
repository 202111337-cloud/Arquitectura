package repository;

import domain.Appointment;
import java.util.ArrayList;
import java.util.List;

/*
 * Persistencia en memoria.
 */
public class InMemoryAppointmentRepository implements AppointmentRepository {

    private final List<Appointment> store = new ArrayList<>();

    @Override
    public void save(Appointment appointment) {
        store.add(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return store;
    }
}
