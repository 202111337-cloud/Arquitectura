// =============================================================
// L: Principio de Sustitución de Liskov (LSP)
// =============================================================
public class EmailNotificador implements Notifica {
    private String email;

    public EmailNotificador(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("📧 Email enviado a " + email + ": " + message);
    }
}
