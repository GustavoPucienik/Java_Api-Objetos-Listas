public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.nome = "O poderoso chefão";
    meuFilme.anoDeLancamento = 1970;
    meuFilme.duracaoEmMinuto = 180;
    meuFilme.avalia(10);
    meuFilme.avalia(8);
    meuFilme.avalia(7);

    meuFilme.exibeFichaTecnica();
    System.out.println(meuFilme.pegaMedia());
  }
}
