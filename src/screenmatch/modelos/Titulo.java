package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import screenmatch.ErroDeConversaoDeAno;

public class Titulo implements  Comparable<Titulo> {
  @SerializedName("Title")
  private String nome;
  @SerializedName("Year")
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaAvaliacao;
  private int totalDeAvaliacoes;
  private int duracaoEmMinuto;

  public Titulo(String nome, int anoDeLancamento) {
    this.nome = nome;
    this.anoDeLancamento = anoDeLancamento;
  }

  public Titulo(TituloOMDB meuTituloOmdb) throws Exception {
    this.nome = meuTituloOmdb.title();
    if (meuTituloOmdb.year().length() > 4) {
      throw new ErroDeConversaoDeAno("Não consegui converter o ano \nPor que tem mais de 4 caracteres.");
    }
    this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
    this.duracaoEmMinuto = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
  }

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

  public int getDuracaoEmMinutos() {
    return duracaoEmMinuto;
  }

  @Override
  public int compareTo(Titulo x) {
    return this.getNome().compareTo(x.getNome());
  }

  @Override
  public String toString() {
    return "(nome = '" + nome + '\'' +
        ", anoDeLancamento = " + anoDeLancamento +
        ", duração em minutos = " + duracaoEmMinuto + ")";
  }
}
