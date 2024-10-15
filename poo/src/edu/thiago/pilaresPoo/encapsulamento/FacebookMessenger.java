package edu.thiago.pilaresPoo.encapsulamento;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Facebook");
        //salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo Facebook");
    }

    // private void validarConectadoInternet(){
    //     System.out.println("Validando se está conectado na Internet");
    // }

    // private void salvarHistoricoMensagem(){
    //     System.out.println("Salvando o histórico da mensagem");
    // }
}
