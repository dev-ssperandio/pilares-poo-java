package polimorfismo;

import polimorfismo.apps.FacebookMessenger;
import polimorfismo.apps.MSNMessenger;
import polimorfismo.apps.ServicoMensagemInstantanea;
import polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
         * NÃO SE SABE QUAL APP PEDRINHO ESCOLHERÁ
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fcm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();

    }

}
