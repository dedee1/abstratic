package Patterns.Abstract_Factory;

//cliente so conhece as abstrações
public class Aplicacao {
    private final Botao botao;
    private final Input input;

    public Aplicacao(Fabricas fabrica) {
        this.botao = fabrica.criarBotao();
        this.input = fabrica.criarInput();
    }

    public void renderizar() {
        botao.renderizarBotao();
        input.renderizarInput();
    }
}
