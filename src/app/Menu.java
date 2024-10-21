package app;

import logica.logicaQuarto;
import logica.logicaReserva;

public class Menu {

    public static void menu() {
        int opc1;
        int opc2;

        do {


            cabecalhoPrincipal();
            opc1 = Main.getSc().nextInt();
            Main.getSc().nextLine();

            switch (opc1) {
                case 0:
                    break;
                case 1:
                    do {
                        cabecalhoQuartos();
                        opc2 = Main.getSc().nextInt();
                        Main.getSc().nextLine();
                        switch (opc2) {
                            case 0:
                                break;
                            case 1:
                                logica.logicaQuarto.adicionarQuarto();
                                break;
                            case 2:
                                logica.logicaQuarto.listarQuartosDisponiveis();
                                System.out.println("Quarto que deseja remover [número]: ");
                                logicaQuarto.removerQuarto(Main.getSc().nextInt());
                                break;
                            case 3:
                                logicaQuarto.listarQuartos();
                                break;
                        }
                    } while (opc2 != 0);
                    break;
                case 2:

                    do {
                        cabecalhoReservas();
                        opc2 = Main.getSc().nextInt();
                        Main.getSc().nextLine();
                        switch (opc2) {
                            case 0:
                                break;
                            case 1:
                                logicaReserva.adicionarReserva();
                                break;
                            case 2:
                                logicaReserva.listarReservas();
                                System.out.println("Selecione a reserva que deseja finalizar [id]:");
                                logicaReserva.finalizarReserva(Main.getSc().nextInt());
                                break;
                            case 3:
                                logicaReserva.listarReservas();
                                break;
                            case 4:
                                System.out.println("Nome do hospede:");
                                logicaReserva.listarPorHospede(Main.getSc().nextLine());
                                break;
                        }
                    } while (opc2 != 0);
                    break;
            }
        } while (opc1 != 0);
    }

    public static void cabecalhoPrincipal() {
        System.out.println("-- Gerenciamento Hotel --");
        System.out.println("1. Quartos");
        System.out.println("2. Reservas");
        System.out.println("3. Relatórios");
        System.out.println("0. Sair");
    }

    public static void cabecalhoQuartos() {
        System.out.println("-- Quartos --");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Listar");
        System.out.println("0. Voltar");
    }

    public static void cabecalhoReservas() {
        System.out.println("-- Reservas --");
        System.out.println("1. Adicionar");
        System.out.println("2. Finalizar");
        System.out.println("3. Listar");
        System.out.println("4. Histórico/Hóspede");
        System.out.println("0. Voltar");
    }
}
