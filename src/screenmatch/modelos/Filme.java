package screenmatch.modelos;

public class Filme {
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaAvaliacao;
  private int totalDeAvaliacoes;
  private int duracaoEmMinuto;

  public void exibeFichaTecnica(){
    System.out.println("Nome do filme: "+this.nome);
    System.out.println("Ano de lançamento: "+this.anoDeLancamento);
    System.out.println(this.somaAvaliacao);
  }

  public void avalia(double nota){
    this.somaAvaliacao += nota;
    totalDeAvaliacoes++;
  }

  public double pegaMedia(){
    return somaAvaliacao / totalDeAvaliacoes;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void setDuracaoEmMinuto(int duracaoEmMinuto) {
    this.duracaoEmMinuto = duracaoEmMinuto;
  }

  public String getNome() {
    return nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public int getTotalDeAvaliacoes(){
    return totalDeAvaliacoes;
  }

  public int getDuracaoEmMinuto() {
    return duracaoEmMinuto;
  }
}
