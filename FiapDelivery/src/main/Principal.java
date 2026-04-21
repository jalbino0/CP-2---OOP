package main;

import model.Moto;
import model.Caminhao;
import model.Pacote;
import model.Rota;
import model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Caminhao("ABC1234", 500.0, 6);  // Para testar com uma moto, trocar para " Veiculo veiculo = new Moto("ABC1234", 20.0, true)"

        Pacote pacote = new Pacote("BR999", 10.5, "Pendente");

        Rota rota = new Rota(pacote, veiculo);
        rota.iniciarEntrega();

        System.out.println("Status do pacote: " + pacote.getStatus());
    }
}