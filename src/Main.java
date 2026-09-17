void main() {

    //criando um novo objetos
    Biscoito biscoito1 = new Biscoito("Chocolate","Redondo", "Marrom");

    Biscoito biscoito2 = new Biscoito("Morango","Coração","Rosa");



    /*biscoito1.setSabor("Baunilha");
    IO.println(biscoito1.getSabor());
biscoito1.setFormato("Triangulo");
    IO.println(biscoito1.getFormato());


  biscoito2.decorar();
 biscoito1.decorar();*/

    BiscoitoRecheado recheado1 = new BiscoitoRecheado("Morango","Coração","Vermelho","Ninho");
    BiscoitoDecorado decorado1 = new BiscoitoDecorado("Baunilha","Redondo","Azul","Granulado");

    IO.println(recheado1);

    biscoito1.preparar();
    recheado1.preparar();
    decorado1.preparar();



}