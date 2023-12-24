import screenmatch.modelos.Filme;

public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinuto(180);
    meuFilme.avalia(10);
    meuFilme.avalia(8);
    meuFilme.avalia(7);

    meuFilme.exibeFichaTecnica();
    System.out.println("Média do filme: " + meuFilme.pegaMedia());
    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
  }
}
