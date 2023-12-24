import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.modelos.Serie;
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

    System.out.println(""" 
                                 -----------
                                 """);
    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(12);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

    System.out.println("-------------");

    Filme outroFilme = new Filme();
    outroFilme.setNome("Avatar");
    outroFilme.setAnoDeLancamento(1970);
    outroFilme.setDuracaoEmMinuto(220);

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(meuFilme);
    calculadora.inclui(outroFilme);
    calculadora.inclui(lost);
    System.out.println(calculadora.getTempoTotal());
  }
}
