package DesafioAula03;

import DesafioAula03.Carro;

class ModeloCarro extends Carro {
  public ModeloCarro(String nomeModelo) {
    super();
    setModelo(nomeModelo);

  }

  public static void main(String[] args) {
    ModeloCarro meuCarro = new ModeloCarro("Modelo X");

    meuCarro.setPreco(2021, 75000);
    meuCarro.setPreco(2022, 80000);
    meuCarro.setPreco(2023, 85000);

    meuCarro.exibirInformacoes();
  }
}