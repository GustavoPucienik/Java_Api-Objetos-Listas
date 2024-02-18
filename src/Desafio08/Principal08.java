package Desafio08;

import java.util.ArrayList;

public class Principal08 {
  public static void main(String[] args) {
    class Animal {
      String nome;

      public Animal(String nome){
        this.nome = nome;
      }
    }

    class Cachorro extends Animal{
      public Cachorro(String nome){
        super(nome);
      }
    }

    ArrayList<Animal> listaDeAnimais = new ArrayList<>();

    listaDeAnimais.add(new Animal("gato007"));
    listaDeAnimais.add(new Cachorro("Catioro1"));

for (Animal animal: listaDeAnimais){
  if (animal instanceof Cachorro cachorro){
    System.out.println(cachorro.nome + " é um cachorro.");
  } else{
    System.out.println("Nome do animal: " + animal.nome);
  }
}

    class Produto {
      private String nome;
      private double preco;

      public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
      }

      public double getPreco() {
        return preco;
      }
    }


    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    listaDeProdutos.add(new Produto("Produto 1", 10.5));
    listaDeProdutos.add(new Produto("Produto 2", 8.0));
    listaDeProdutos.add(new Produto("Produto 3", 5.75));

    double somaDosPrecos = 0;
    for (Produto produto : listaDeProdutos) {
      somaDosPrecos += produto.getPreco();
    }

    double precoMedio = somaDosPrecos / listaDeProdutos.size();
    System.out.println("Preço médio dos produtos: " + precoMedio);



    interface Forma {
      double calcularArea();
    }

    class Circulo implements Forma {
      private double raio;

      public Circulo(double raio) {
        this.raio = raio;
      }

      @Override
      public double calcularArea() {
        return Math.PI * raio * raio;
      }
    }

    class Quadrado implements Forma {
      private double lado;

      public Quadrado(double lado) {
        this.lado = lado;
      }

      @Override
      public double calcularArea() {
        return lado * lado;
      }
    }

    ArrayList<Forma> listaDeFormas = new ArrayList<>();
    listaDeFormas.add(new Circulo(5));
    listaDeFormas.add(new Quadrado(4));

    for (Forma forma : listaDeFormas) {
      double area = forma.calcularArea();
          System.out.printf("Área da forma: " + area + "\n");
}





    class ContaBancaria {
      private int numeroDaConta;
      private double saldo;

      public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
      }

      public double getSaldo() {
        return saldo;
      }
    }

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(new ContaBancaria(1, 1000));
        listaDeContas.add(new ContaBancaria(2, 5000));
        listaDeContas.add(new ContaBancaria(3, 2000));

        ContaBancaria contaComMaiorSaldo = null;
        double maiorSaldo = Double.MIN_VALUE;

        for (ContaBancaria conta : listaDeContas) {
          if (conta.getSaldo() > maiorSaldo) {
            maiorSaldo = conta.getSaldo();
            contaComMaiorSaldo = conta;
          }
        }

        System.out.println("Conta com maior saldo: " + contaComMaiorSaldo.getSaldo());



  }
}

