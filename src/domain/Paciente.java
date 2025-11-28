package domain;
// Paciente actúa como receptor lógico de notificaciones y cumple SRP:
// mantiene datos del paciente y delega la notificación a un Notifica.

public class Paciente implements Notifica {
    private String name;
    private Notifica notifier; // cumple DIP: depende de abstracción

    public Paciente(String name, Notifica notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    @Override
    public void notify(String message) {
        notifier.notify("Estimado(a) " + name + ", " + message);
    }

    public String getName() { return name; }
}
