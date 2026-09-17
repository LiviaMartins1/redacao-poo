public class BiscoitoDecorado extends Biscoito {
    private String decoracao;

    @Override
    public String toString() {
        return super.toString()+
                "BiscoitoDecorado{" +
                "decoracao='" + decoracao + '\'' +
                '}';
    }

    public BiscoitoDecorado(String sabor, String formato, String cor, String decoradocao) {
        super(sabor, formato, cor);
        this.decoracao = decoracao;
    }
}
