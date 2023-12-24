package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
  private int tempoTotal;
  public int getTempoTotal() {
    return tempoTotal;
  }
  public int inclui(Titulo titulo){
    System.out.println("Adicionando duração em minutos de "+ titulo);
    return this.tempoTotal += titulo.getDuracaoEmMinutos();
  }
}
