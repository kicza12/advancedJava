package kolekcje.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        System.out.println(lista);
        List<Integer> listaIntegerow = new ArrayList<>();
        for (String s : lista) {
            listaIntegerow.add(Integer.parseInt(s));
        }
        System.out.println(listaIntegerow);
    }
}
