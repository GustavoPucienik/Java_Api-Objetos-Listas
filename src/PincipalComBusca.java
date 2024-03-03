import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.ErroDeConversaoDeAno;
import screenmatch.modelos.Titulo;
import screenmatch.modelos.TituloOMDB;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PincipalComBusca {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite um filme para busca: ");
    var busca = leitura.nextLine();

    String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=3bf61f2b";

    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(endereco))
          .build();

      HttpResponse<String> response = client
          .send(request, HttpResponse.BodyHandlers.ofString());
      String json = response.body();
      System.out.println(json);

      Gson gson = new GsonBuilder()
          .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
          .create();

      TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
      System.out.println(meuTituloOmdb);

      try {
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Titulo já convertido");
        System.out.println(meuTitulo);
      } catch (NumberFormatException e) {
        System.out.println("Aconteceu um erro: ");
        System.out.println(e.getMessage());
      } catch (IllegalArgumentException e) {
        System.out.println("Algum erro na busca, verifique p endereço");
        System.out.println(e.getMessage());
      } catch (ErroDeConversaoDeAno e) {
        System.out.println(e.getMessage());
      }
    } catch (Exception e) {
      System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
    }

    System.out.println("O programa finalizou corretamente!");
  }

}
