package logica;

import app.Main;
import objetos.Quarto;

import java.util.ArrayList;
import java.util.List;

public class logicaQuarto {

    static List<Quarto> listaQuartos = new ArrayList<Quarto>();

    public static void quartos() {
        Quarto quarto1 = new Quarto(10, 1, 120.00);
        Quarto quarto2 = new Quarto(20, 3, 300.00);
        Quarto quarto3 = new Quarto(30, 2, 150.00);

        listaQuartos.add(quarto1);
        listaQuartos.add(quarto2);
        listaQuartos.add(quarto3);
    }


    public static void adicionarQuarto() {
        int numero = 0;
        int tipo = 0;
        double diaria = 0;
        System.out.println("-- Adicionar Quarto --");

        System.out.println("Número: ");
        numero = Main.getSc().nextInt();
        Main.getSc().nextLine();
        System.out.println("Tipo: ");
        tipo = Main.getSc().nextInt();
        System.out.println("Diaria: ");
        diaria = Main.getSc().nextDouble();

        Quarto quarto = new Quarto(numero, tipo, diaria);
        listaQuartos.add(quarto);
    }

    public static void disponiblidadeFalse(int numero) {
        for (Quarto quarto : listaQuartos) {
            if (quarto.getNumero() == numero) {
                quarto.setDisponibilidade(false);
            }
        }
    }

    public static void disponiblidadeTrue(int numero) {
        for (Quarto quarto : listaQuartos) {
            if (quarto.getNumero() == numero) {
                quarto.setDisponibilidade(true);
            }
        }
    }

    public static void removerQuarto(int numero) {
        for (Quarto quartos : listaQuartos) {
            if (quartos.getNumero() == numero) {
                listaQuartos.remove(quartos);
            }
        }
    }

    public static void listarQuartos() {
        for (Quarto quartos : listaQuartos) {
            System.out.println(quartos.toString());
        }
    }

    public static void listarQuartosDisponiveis() {
        for (Quarto quartos : listaQuartos) {
            if (quartos.isDisponibilidade()) {
                System.out.println(quartos.toString());
            }
        }
    }

    public static Quarto capturarQuarto(int numero) {
        for (Quarto quartos : listaQuartos) {
            if (quartos.isDisponibilidade() && quartos.getNumero() == numero) {
                return quartos;
            }
        }
        return null;
    }

}
