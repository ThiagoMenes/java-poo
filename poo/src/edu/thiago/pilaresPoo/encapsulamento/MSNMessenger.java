package edu.thiago.pilaresPoo.encapsulamento;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN");
        //salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo MSN");
    }

    // private void validarConectadoInternet(){
    //     System.out.println("Validando se está conectado na Internet");
    // }

    // private void salvarHistoricoMensagem(){
    //     System.out.println("Salvando o histórico da mensagem");
    // }
}
