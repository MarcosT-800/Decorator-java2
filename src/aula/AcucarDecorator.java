package aula;

public class AcucarDecorator extends BebidaDecorator {
    public AcucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Açúcar";
    }

    @Override
    public double obterCusto() {
        return super.obterCusto() + 0.5;
    }
}
