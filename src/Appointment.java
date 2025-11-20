// =============================================================
// S: Principio de Responsabilidad Única (SRP)
// =============================================================

public class Appointment {
    private String date;
    private String doctorName;
    private boolean confirmed;

    public Appointment(String date, String doctorName) {
        this.date = date;
        this.doctorName = doctorName;
        this.confirmed = false;
    }

    public void confirm() {
        this.confirmed = true;
    }

    public String getDate() { 
        return date; 
    }
    public String getDoctorName() {
        return doctorName; 
    }
    public boolean isConfirmed() {
        return confirmed; 
    }
}
