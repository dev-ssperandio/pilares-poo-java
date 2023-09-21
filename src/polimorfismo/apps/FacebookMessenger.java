package polimorfismo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    
    public void receberMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem pelo Facebook Messenger");
    }
}
