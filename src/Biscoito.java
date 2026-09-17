public class Biscoito {
    //Definir atributos
    private String sabor;
    private String formato;
    private String cor;

    //definir métodos
    public void decorar(){
        IO.println("O biscoito foi decorado!");
    }
    public void preparar(){
        IO.println("Preparando Biscoito");
    }

    //Construtor
    public Biscoito(String sabor, String formato, String cor) {
        this.sabor = sabor;
        this.formato = formato;
        this.cor = cor;

    }

    public String getSabor() {
        return sabor;
    }
    //so pode alterar se for esses tres sabores
    public void setSabor(String sabor) {
        if (sabor.equals("Chocolate") ||
                sabor.equals("Baunilha") ||
                sabor.equals("Morango")){
            this.sabor = sabor;
        }
        else {
            IO.println("Sabor invalido");

        }
    }

    public String getFormato() {
            return formato;
        }

    public void setFormato(String formato) {
        if (formato.equals("Redondo") ||
                formato.equals("Quadrado") ||
                formato.equals("Coração")) {
            this.formato = formato;
        } else{
            IO.println("Formato invalido");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Biscoito:"+
                "sabor='" + sabor + '\'' +
                ", formato='" + formato + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

}



