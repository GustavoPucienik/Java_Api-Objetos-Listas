package Desafio10;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

  private double limite;
  private List<Compra> compras;

  public CartaoDeCredito(double limite) {
    this.limite = limite;
    this.compras = new ArrayList<>();
  }
  public double getLimite() {
    return limite;
  }

  public List<Compra> getCompras() {
    return compras;
  }

  public boolean lancaCompra(Compra compra) {
    if(this.limite >= compra.getValor()) {
      this.limite -= compra.getValor();
      this.compras.add(compra);
      return true;
    }

    return false;
  }
}
