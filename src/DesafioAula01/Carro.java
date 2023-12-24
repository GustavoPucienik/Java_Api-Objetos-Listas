package DesafioAula01;

public class Carro {
  static String modelo;
  static String cor;
  static int ano;

  public static void main(String[] args) {
    modelo = "Fiat Uno";
    cor = "Branco";
    ano = 2013;

    exibeFichaTecnica();
  }

  public static void exibeFichaTecnica() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
  }
}
