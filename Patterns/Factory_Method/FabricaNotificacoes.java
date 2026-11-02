package Patterns.Factory_Method;

// notificar fica aqui;
// a subclasse decide qual notificação ela cria;
public abstract class FabricaNotificacoes {

    // Factory Method: implementado pelas fábricas concretas.
    protected abstract IntNotificacoes criarNotificacao();

    // Fluxo comum: usa apenas a abstração IntNotificacoes.
    public void notificar() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
