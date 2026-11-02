package Patterns.Factory_Method;

public class FabricaSMS extends FabricaNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}
