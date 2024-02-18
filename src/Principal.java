import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
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

    Serie lost = new Serie("Lost", 2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(12);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

    System.out.println("-------------");

    Filme outroFilme = new Filme("Avatar", 2023);
    outroFilme.setDuracaoEmMinuto(220);

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(meuFilme);
    calculadora.inclui(outroFilme);
    calculadora.inclui(lost);
    System.out.println(calculadora.getTempoTotal());

    var filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.setDuracaoEmMinuto(200);
    filmeDoPaulo.avalia(10);

    ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    listaDeFilmes.add(meuFilme);
    listaDeFilmes.add(outroFilme);
    listaDeFilmes.add(filmeDoPaulo);

    System.out.println("Tamanho da lista " + listaDeFilmes.size());
    System.out.println("Primeiro filme é " + listaDeFilmes.get(0).getNome());
    System.out.println(listaDeFilmes);
    System.out.println("toString do filme é " + listaDeFilmes.get(0).toString());


    System.out.println("-------------");

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(meuFilme);

    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(lost);
    episodio.setTotalVizualizacoes(300);
    filtro.filtra(episodio);
  }
}
