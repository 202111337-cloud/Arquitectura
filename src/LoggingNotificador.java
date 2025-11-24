// Decorator que añade logging al acto de notificar sin modificar las clases originales
public class LoggingNotificador implements Notifica {
    private final Notifica wrapped;

    public LoggingNotificador(Notifica wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void notify(String message) {
        // comportamiento adicional: registro previo
        System.out.println("[LOG] Enviando notificación: " + message);
        // delega en el notificador real
        wrapped.notify(message);
        // comportamiento adicional: registro posterior
        System.out.println("[LOG] Notificación enviada correctamente.");
    }
}
