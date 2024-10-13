package edu.thiago.pilaresPoo;

public class Carro extends Veiculo {

    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    };

    private void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    };

    private void confereCambio(){
        System.out.println("Conferindo Cambio em P");
    };
}
