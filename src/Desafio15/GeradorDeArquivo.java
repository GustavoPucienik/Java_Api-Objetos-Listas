package Desafio15;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
  public void salvaJson(Endereco endereco) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    FileWriter escrita = null;
    try {
      escrita = new FileWriter(endereco.cep() + ".json");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    escrita.write(gson.toJson(endereco));
    escrita.close();
  }
}
