package logica;

import app.Main;
import objetos.Quarto;
import objetos.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class logicaReserva {

    static List<Reserva> listaReservas = new ArrayList<Reserva>();
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void adicionarReserva() {
        int id = listaReservas.size();
        int numeroQuarto;
        String hospede;
        LocalDate check_in;
        Quarto quarto;

        System.out.println("Nome do hospede: ");
        hospede = Main.getSc().nextLine();

        System.out.println("Data de check-in [dd/MM/yyyy]");
        check_in = LocalDate.parse( Main.getSc().nextLine(), dtf);

        System.out.println("Selecione o quarto: ");
        logicaQuarto.listarQuartosDisponiveis();

        numeroQuarto = Main.getSc().nextInt();
        Main.getSc().nextLine();

        quarto = logicaQuarto.capturarQuarto(numeroQuarto);
        logicaQuarto.disponiblidadeFalse(numeroQuarto);

        Reserva reserva = new Reserva(hospede, id, check_in, quarto);
        listaReservas.add(reserva);
    }

    public static void finalizarReserva(int id) {
        LocalDate check_out;
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == id && reserva.getCheck_out() == null) {
                System.out.println("Data de check-out [dd/MM/yyyy]");
                check_out = LocalDate.parse(Main.getSc().next(), dtf);
                reserva.setCheck_out(check_out);
                logicaQuarto.disponiblidadeTrue(reserva.getQuarto().getNumero());
            }
        }
    }

    public static void listarReservas() {
        for (Reserva reserva : listaReservas) {
            System.out.println(reserva.toString());
        }
    }

    public static void listarPorHospede(String hospede) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getHospede().equals(hospede)) {
                System.out.println(reserva.toString());
            }
        }
    }
}
