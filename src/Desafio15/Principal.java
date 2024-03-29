package Desafio15;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner le = new Scanner(System.in);
    System.out.println("Digite um cep para buscar: ");
    String cep = le.nextLine();

    ConsultaCep consultaCep = new ConsultaCep();
    try {
      Endereco novoEndereco = consultaCep.buscaEndereco(cep);
      System.out.println(novoEndereco);
      GeradorDeArquivo gerador = new GeradorDeArquivo();
      gerador.salvaJson(novoEndereco);
    } catch (RuntimeException | IOException e) {
      System.out.println(e.getMessage());
      System.out.println("Finalizando a aplicação");
    }


  }
}
