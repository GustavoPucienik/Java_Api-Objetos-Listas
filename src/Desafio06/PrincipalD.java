package Desafio06;
import java.util.ArrayList;

class Pessoa {
  private String nome;
  private int idade;

  // Construtor
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Método toString
  @Override
  public String toString() {
    return "Nome: " + nome + ", Idade: " + idade;
  }
}

public class PrincipalD {
  public static void main(String[] args) {
    // Criando ArrayList de Pessoa
    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    // Adicionando pessoas à lista
    listaDePessoas.add(new Pessoa("Ana", 30));
    listaDePessoas.add(new Pessoa("Gustavo", 21));
    listaDePessoas.add(new Pessoa("Maria", 35));

    // Imprimindo tamanho da lista
    System.out.println("Tamanho da lista: " + listaDePessoas.size());

    // Imprimindo a primeira pessoa da lista
    Pessoa primeiraPessoa = listaDePessoas.get(0);
    System.out.println("Primeira pessoa da lista: " + primeiraPessoa);

    // Imprimindo lista completa
    System.out.println("Lista completa:");
    for (Pessoa pessoa : listaDePessoas) {
      System.out.println(pessoa);
    }
    System.out.println("Primeiro elemento: " + listaDePessoas.get(0));
  }
}
