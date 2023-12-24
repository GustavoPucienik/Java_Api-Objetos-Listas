package DesafioAula03;

public class Gato extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Miado de gato");
  }

  public void arranharMoveis() {
    System.out.println("Gato arranhando móveis");
  }
    public static void main(String[] args) {
      Cachorro meuCachorro = new Cachorro();
      Gato meuGato = new Gato();

      meuCachorro.emitirSom();
      meuCachorro.abanarRabo();

      meuGato.emitirSom();
      meuGato.arranharMoveis();
    }

}
