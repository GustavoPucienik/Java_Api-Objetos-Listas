package Desafio02;

public class Alunos {
  private String nome;
  private double[] notas;

  // Construtor
  public Alunos(String nome, double[] notas) {
    this.nome = nome;
    this.notas = notas;
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  // Método para calcular a média das notas
  public double calcularMedia() {
    double soma = 0;
    for (double nota : notas) {
      soma += nota;
    }
    return soma / notas.length;
  }
}
