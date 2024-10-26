package aula;

public class LeiteDecorator extends BebidaDecorator {
    public LeiteDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Leite";
    }

    @Override
    public double obterCusto() {
        return super.obterCusto() + 1.5;
    }
}
