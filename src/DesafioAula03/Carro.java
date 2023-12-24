package DesafioAula03;

import java.util.HashMap;
import java.util.Map;

class Carro {
  private String modelo;
  private Map<Integer, Double> precos;

  public Carro() {
    this.modelo = "";
    this.precos = new HashMap<>();
  }

  public void setModelo(String nomeModelo) {
    this.modelo = nomeModelo;
  }

  public void setPreco(int ano, double preco) {
    this.precos.put(ano, preco);
  }

  public double calcularMenorPreco() {
    return precos.values().stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
  }

  public double calcularMaiorPreco() {
    return precos.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
  }

  public void exibirInformacoes() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Menor preço: R$" + calcularMenorPreco());
    System.out.println("Maior preço: R$" + calcularMaiorPreco());
  }
}
