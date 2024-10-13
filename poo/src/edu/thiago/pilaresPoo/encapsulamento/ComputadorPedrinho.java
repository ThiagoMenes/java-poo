package edu.thiago.pilaresPoo.encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();

        FacebookMessenger fb = new FacebookMessenger();

        fb.enviarMensagem();

        fb.receberMensagem();

        TelegramMessenger tlg = new TelegramMessenger();

        tlg.enviarMensagem();

        tlg.receberMensagem();
    }
}
