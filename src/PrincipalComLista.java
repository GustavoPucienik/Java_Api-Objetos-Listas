import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
  public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    meuFilme.avalia(8);
    Filme outroFilme = new Filme("Avatar", 2023);
    outroFilme.avalia(6);
    var filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.avalia(7);
    Serie lost = new Serie("Lost", 2000);

    Filme f1 = filmeDoPaulo;
    f1.avalia(10);

    List<Titulo> lista = new LinkedList<>();

    lista.add(meuFilme);
    lista.add(outroFilme);
    lista.add(filmeDoPaulo);
    lista.add(f1);
    lista.add(lost);

    Collections.sort(lista);

    for (Titulo item: lista){
      System.out.println(item);
      if (item instanceof Filme filme && filme.pegaMedia() > 2){
        System.out.println("Classificação: " + filme.pegaMedia());
      }
    }
    System.out.println(" \n------------ \n ");

    ArrayList<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Adam Sandler");
    buscaPorArtista.add("Paulo");
    buscaPorArtista.add("Jacqueline");
    System.out.println(buscaPorArtista);

    Collections.sort(buscaPorArtista);
    System.out.println(buscaPorArtista + "\n");

    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); ///Comparador
    System.out.println("Ordenando por ano:");
    System.out.println(lista);
  }
}
