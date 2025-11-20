// =============================================================
// SRP e implementa ISP
// =============================================================

public class Paciente implements Notifica {
    private String name;
    private Notifica notifier; // Cumple con DIP

    public Paciente(String name, Notifica notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    @Override
    public void notify(String message) {
        notifier.notify("Estimado(a) " + name + ", " + message);
    }
}
