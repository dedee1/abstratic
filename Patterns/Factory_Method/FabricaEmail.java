package Patterns.Factory_Method;

public class FabricaEmail extends FabricaNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
