package screenmatch;

public class ErroDeConversaoDeAno extends RuntimeException{
  private String mensagem;
  public ErroDeConversaoDeAno(String msg) {
    this.mensagem = msg;
  }

  @Override
  public String getMessage() {
    return this.mensagem;
  }
}
