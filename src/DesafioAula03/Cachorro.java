package DesafioAula03;

public class Cachorro extends Animal{
  @Override
  public void emitirSom() {
    System.out.println("Latido de cachorro");
  }

  public void abanarRabo() {
    System.out.println("Cachorro abanando o rabo");
  }
}
