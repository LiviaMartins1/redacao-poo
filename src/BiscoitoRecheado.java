public class BiscoitoRecheado extends Biscoito {
    private String recheio;

    public BiscoitoRecheado(String sabor, String formato, String cor, String recheio) {
        super(sabor, formato, cor);
        this.recheio = recheio;
    }

    @Override
    public String toString() {
        return super.toString()+
                "BiscoitoRecheado{" +
                "recheio='" + recheio + '\'' +
                '}';
    }
    //Sobreescrever
    @Override
    public void preparar(){
        IO.println("Preparando biscoito e adicionando recheio");

    }
}
