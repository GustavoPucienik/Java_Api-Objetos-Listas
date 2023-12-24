package DesafioAula03;

public class ContaCorrente extends ContaBancaria {
  private double tarifaMensal;

  public ContaCorrente(double saldoInicial, double tarifaMensal) {
    super(saldoInicial);
    this.tarifaMensal = tarifaMensal;
  }

  public void cobrarTarifaMensal() {
    saldo -= tarifaMensal;
    System.out.println("Tarifa mensal de R$" + tarifaMensal + " debitada da conta corrente.");
  }

  public static void main(String[] args) {
    ContaCorrente minhaConta = new ContaCorrente(1000.0, 20.0);

    minhaConta.depositar(500.0);
    minhaConta.sacar(200.0);

    System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());

    minhaConta.cobrarTarifaMensal();
    System.out.println("Saldo após tarifa: R$" + minhaConta.consultarSaldo());
  }
}
