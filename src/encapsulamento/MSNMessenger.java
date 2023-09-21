package encapsulamento;

public class MSNMessenger {
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistorioMensagem();
    }
    
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    
    private void salvarHistorioMensagem() {
        System.out.println("Salvando o hitórico da mensagem");
    }
}
