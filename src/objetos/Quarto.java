package objetos;

public class Quarto {

    private int numero;
    private int tipo;
    private double diaria;
    private boolean disponibilidade;

    public Quarto(int numero, int tipo, double diaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.diaria = diaria;
        this.disponibilidade = true;
    }

    public Quarto() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String converteTipo(int tipo) {
        switch (tipo) {
            case 1:
                return "Diaria";
            case 2:
                return "Casal";
            case 3:
                return "Suíte";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return  "Quarto: " + numero +
                "| tipo: " + converteTipo(tipo) +
                "| diaria: R$" + diaria +
                "| disponível:" + disponibilidade;
    }
}
