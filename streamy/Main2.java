package streamy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> lista = List.of("zupa", "makaron", "pierogi", "schabowy", "schabowy");
        long liczba = lista.stream().count();
        System.out.println("Liczba elementów: " + liczba);
        long liczba1 = lista.stream().filter(element -> element.length() > 4).count();
        System.out.println("Liczba elementów o długości minimum 5: " + liczba1);
        long liczba2 = lista.stream().filter(element -> element.length() > 4).mapToInt(String::length).sum();
        System.out.println("Długość wszystkich Stringów: " + liczba2);
        long liczba3 = lista.stream().distinct().filter(element -> element.length() > 4).mapToInt(String::length).sum();
        System.out.println("Długości każdego unikalnego obiektu: " + liczba3);
        boolean czySieKonczyY = lista.stream().anyMatch(element -> element.endsWith("y"));
        System.out.println(czySieKonczyY);
        List<Integer> dlugosci = lista.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Lista z długościami Stringów: " + dlugosci);


    }
}
