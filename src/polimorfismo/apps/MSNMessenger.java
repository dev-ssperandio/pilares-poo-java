package polimorfismo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    
    public void receberMensagem() {
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem pelo MSN Messenger");
    }

}
