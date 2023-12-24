package DesafioAula01;

public class Musica {
  public static void main(String[] args) {
    String titulo, artista, anoLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    titulo = "Gostava tanto de você";
    artista = "Tim maia";
    anoLancamento = "1973";
    avaliacao = 4.7;
    numeroDeAvaliacoes = 1000;

    ExibeFichaTecnica(titulo, artista, anoLancamento, avaliacao, numeroDeAvaliacoes);
  }
  public static void ExibeFichaTecnica(String titulo, String artista, String anoLancamento, double avaliacao, int numeroDeAvaliacoes){
    System.out.println("Título: " + titulo);
    System.out.println("Artista: " + artista);
    System.out.println("Ano de Lançamento: " + anoLancamento);
    System.out.println("Avaliação: " + avaliacao);
    System.out.println("Número de Avaliações: " + numeroDeAvaliacoes);
  }
}
