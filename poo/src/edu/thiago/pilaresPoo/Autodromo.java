package edu.thiago.pilaresPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        // jeep.confereCambio();
        // jeep.confereCombustivel();
        jeep.ligar();
        jeep.setChassi("456123");
       

        Moto z400 = new Moto();

        z400.setChassi("897456");
        z400.ligar();

    }
    
}
