package polimorfismo.apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    
    public void receberMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem pelo Telegram");
    }

    
}
