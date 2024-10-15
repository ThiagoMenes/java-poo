package edu.thiago.pilaresPoo.encapsulamento;

public abstract class ServicoMensagemInstantanea {
// Classe abstrata com métodos abstratos "Sem corpo" na classe Pai
// as Classes que extendem essa classe definem o "Corpo" e próprio funcionamento do método
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente as classes "Filhas" conhecem este método Protected
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado à internet");
    }


    // public void enviarMensagem(){
    //     validarConectadoInternet();
    //     System.out.println("Enviando Mensagem");
    //     salvarHistoricoMensagem();
    // }

    // public void receberMensagem(){
    //     System.out.println("Recebendo Mensagem");
    // }

    // private void validarConectadoInternet(){
    //     System.out.println("Validando se está conectado na Internet");
    // }

    // private void salvarHistoricoMensagem(){
    //     System.out.println("Salvando o histórico da mensagem");
    // }
}
