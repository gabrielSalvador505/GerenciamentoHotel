package objetos;

import java.time.LocalDate;

public class Reserva {

    private int id;
    String hospede;
    private LocalDate check_in;
    private LocalDate check_out;
    private Quarto quarto;

    public Reserva(String hospede, int id, LocalDate check_in, Quarto quarto) {
        this.hospede = hospede;
        this.id = id;
        this.check_in = check_in;
        this.check_out = null;
        this.quarto = quarto;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCheck_in() {
        return check_in;
    }

    public void setCheck_in(LocalDate check_in) {
        this.check_in = check_in;
    }

    public LocalDate getCheck_out() {
        return check_out;
    }

    public void setCheck_out(LocalDate check_out) {
        this.check_out = check_out;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "Reserva: " + id +
                "| Hospede: " + hospede +
                "| Check-in: " + check_in +
                "| Check-out: " + check_out +
                "| Quarto: " + quarto;
    }
}
