package edu.thiago.pilaresPoo.encapsulamento;
import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual Aplicativo deseja utilizar?:");
        System.out.println("fb, msn ou tlg?");
        String appEscolhido = leitor.next();

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fb")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("tlg")){
            smi = new TelegramMessenger();
        };

        smi.enviarMensagem();
        smi.receberMensagem();
        leitor.close();
        // MSNMessenger msn = new MSNMessenger();

        // msn.enviarMensagem();

        // msn.receberMensagem();

        // FacebookMessenger fb = new FacebookMessenger();

        // fb.enviarMensagem();

        // fb.receberMensagem();

        // TelegramMessenger tlg = new TelegramMessenger();

        // tlg.enviarMensagem();

        // tlg.receberMensagem();
    }
}
