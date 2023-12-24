public class Filme {
  String nome;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  double somaAvaliacao;
  int totalDeAvaliacoes;
  int duracaoEmMinuto;

  void exibeFichaTecnica(){
    System.out.println(this.nome);
    System.out.println(this.anoDeLancamento);
    System.out.println(this.somaAvaliacao);
  }

  void avalia(double nota){
    this.somaAvaliacao += nota;
    totalDeAvaliacoes++;
  }

  double pegaMedia(){
    return somaAvaliacao / totalDeAvaliacoes;
  }
}
