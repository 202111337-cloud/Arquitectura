package domain;
// =============================================================
// L: Principio de Sustitución de Liskov (LSP)
// =============================================================

public class SmsNotificador implements Notifica {
    private String phoneNumber;

    public SmsNotificador(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        System.out.println("📱 SMS enviado a " + phoneNumber + ": " + message);
    }
}
