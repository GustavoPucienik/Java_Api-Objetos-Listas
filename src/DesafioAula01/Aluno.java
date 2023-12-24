package DesafioAula01;

public class Aluno {
  String nome;
  int idade;
  void exibirInformacoes() {
    System.out.println("Nome do aluno: " + nome);
    System.out.println("Idade do aluno: " + idade);
  }
  public static void main(String[] args) {
    Aluno aluno = new Aluno();

    aluno.nome = "Tom";
    aluno.idade = 12;

    aluno.exibirInformacoes();
  }
}
