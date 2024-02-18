package Desafio09;

import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Terceira {
  public static void main(String[] args) {
    ArrayList<Titulo> listaTitulos = new ArrayList<>();
    listaTitulos.add(new Titulo("D" ,3));
    listaTitulos.add(new Titulo("A",0));
    listaTitulos.add(new Titulo("B",1));

    Collections.sort(listaTitulos);

    for (Titulo titulo : listaTitulos) {
      System.out.println(titulo.getNome());
    }
  }
}
