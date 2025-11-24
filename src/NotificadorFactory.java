// Factory simple para crear instancias de Notifica sin acoplar al consumidor
public class NotificadorFactory {

    public enum Tipo { EMAIL, SMS }

    public static Notifica create(Tipo tipo, String destino) {
        switch (tipo) {
            case SMS:
                return new SmsNotificador(destino);
            case EMAIL:
            default:
                return new EmailNotificador(destino);
        }
    }
}
