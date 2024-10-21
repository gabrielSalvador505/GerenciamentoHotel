package app;


import java.util.Scanner;

import logica.logicaQuarto;
import logica.logicaReserva;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        logicaQuarto.quartos();
        Menu.menu();
    }

    public static Scanner getSc() {
        return sc;
    }
}