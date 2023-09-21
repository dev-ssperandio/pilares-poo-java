package polimorfismo.apps;

public abstract class ServicoMensagemInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // mais um método que todos os filhos deverão implementar
    protected abstract void salvarHistoricoMensagem();
 
    // somente as classes filhas conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
