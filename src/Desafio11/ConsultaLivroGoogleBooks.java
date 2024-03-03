package Desafio11;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaLivroGoogleBooks {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o título do livro para a busca: ");
    var tituloLivro = leitura.nextLine();
    String encodedTitulo = URLEncoder.encode(tituloLivro, "UTF-8");

    String chave = "AIzaSyC2Fd4e72fNU0kn4shGjcMT5ulixXVeL9c";
    String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + encodedTitulo + "&key=" + chave;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());
  }

}
