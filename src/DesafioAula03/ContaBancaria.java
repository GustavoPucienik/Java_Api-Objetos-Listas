package DesafioAula03;

public class ContaBancaria {
  protected double saldo;

  public ContaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Depósito de R$" + valor + " realizado.");
  }

  public void sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      System.out.println("Saque de R$" + valor + " realizado.");
    } else {
      System.out.println("Saldo insuficiente para saque.");
    }
  }

  public double consultarSaldo() {
    return saldo;
  }
}
