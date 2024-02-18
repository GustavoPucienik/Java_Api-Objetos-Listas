package Desafio07;

import java.util.ArrayList;

class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  // Construtor sem parâmetros
  public Produto() {}

  // Construtor com parâmetros
  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  // Métodos getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  // Método toString para representação em texto do objeto
  @Override
  public String toString() {
    return "Produto{" +
        "nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }
}
class ProdutoPerecivel extends Produto {
  private String dataValidade;

  // Construtor que utiliza o construtor da classe mãe (super)
  public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
    super(nome, preco, quantidade);
    this.dataValidade = dataValidade;
  }

  // Getter e setter para dataValidade
  public String getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  // Método toString para representação em texto do objeto
  @Override
  public String toString() {
    return "ProdutoPerecivel{" +
        "nome='" + getNome() + '\'' +
        ", preco=" + getPreco() +
        ", quantidade=" + getQuantidade() +
        ", dataValidade='" + dataValidade + '\'' +
        '}';
  }
}
public class Principal06 {
  public static void main(String[] args) {
    // Criando lista de produtos
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    // Adicionando produtos à lista
    listaDeProdutos.add(new Produto("Arroz", 10.5, 20));
    listaDeProdutos.add(new Produto("Feijão", 8.0, 15));
    listaDeProdutos.add(new Produto("Macarrão", 5.75, 30));

    // Imprimindo tamanho da lista
    System.out.println("Tamanho da lista: " + listaDeProdutos.size());

    // Recuperando um produto pelo índice e imprimindo
    System.out.println("Produto no índice 1: " + listaDeProdutos.get(1));

    // Imprimindo lista de produtos
    System.out.println("Lista de produtos:");
    for (Produto produto : listaDeProdutos) {
      System.out.println(produto);
    }

    // Criando objeto ProdutoPerecivel
    ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 3.5, 10, "10/03/2024");
    System.out.println("Produto Perecível: " + leite);
  }
}
