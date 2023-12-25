package DesafioAula05.principal;

import DesafioAula05.modelos.Musica;
import DesafioAula05.modelos.MinhasPreferidas;
import DesafioAula05.modelos.Podcast;

public class Principal {
  public static void main(String[] args) {
    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("Deixe me ir");
    minhaMusica.setCantor("Cartola");

    for (int i = 0; i < 2500; i++){
      minhaMusica.reproduz();
    }
    for (int i = 0; i < 100; i++){
      minhaMusica.curtir();
    }

    Podcast meuPodcast = new Podcast();
    meuPodcast.setTitulo("Aprendendo Java");
    meuPodcast.setApresentador("Paulo Silveira");


    for (int i = 0; i < 1523; i++){
      meuPodcast.reproduz();
    }
    for (int i = 0; i < 135; i++){
      meuPodcast.curtir();
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();
    preferidas.inclui(meuPodcast);
    preferidas.inclui(minhaMusica);

  }
}
