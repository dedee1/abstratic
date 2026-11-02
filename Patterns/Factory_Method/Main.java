package Patterns.Factory_Method;

public class Main {

    
    static void dispararNotificacao(FabricaNotificacoes fabrica) {
        fabrica.notificar();
    }

    public static void main(String[] args) {
        // Ponto de composição: único lugar que conhece as fábricas concretas.
        dispararNotificacao(new FabricaEmail());
        dispararNotificacao(new FabricaSMS());
    }
}
