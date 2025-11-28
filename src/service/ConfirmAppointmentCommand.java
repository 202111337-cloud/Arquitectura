package service;

// Implementación concreta del comando para confirmar una cita y notificar

import domain.Appointment;
import domain.Paciente;

public class ConfirmAppointmentCommand implements Command {
    private Appointment appointment;
    private Paciente paciente;

    public ConfirmAppointmentCommand(Appointment appointment, Paciente paciente) {
        this.appointment = appointment;
        this.paciente = paciente;
    }

    @Override
    public void execute() {
        // Acción: confirmar cita y notificar
        appointment.confirm();
        paciente.notify("Su cita con el Dr. " + appointment.getDoctorName() + 
                        " ha sido confirmada para el " + appointment.getDate());
    }
}
