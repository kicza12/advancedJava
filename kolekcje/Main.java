package kolekcje;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        SET
        // tworzymy Set, wybieramy implementacje HashSet
        Set<String> przykladowySet = new HashSet<>();
        //        nie mozna dodac dwoch tych samych wartosci!
//        zajmuje mniej miejsca
//        jest szybsze w obsłudze
//        brak indeksów
// dodajemy wartości
        przykladowySet.add("wartosc1");
        przykladowySet.add("wartosc2");
        przykladowySet.add("wartosc3");
        przykladowySet.add("wartosc4");
        // usuwamy
        przykladowySet.remove("wartosc4");
        // sprawdzamy czy wartość istnieje w Setcie
        boolean czyPosiada = przykladowySet.contains("wartosc2");
        // czy Set jest pusty
        if (przykladowySet.isEmpty()) {

        }
        // wielkość Setu
        int size = przykladowySet.size();
        // czyścimy Set
        przykladowySet.clear();
        // iterujemy po Setcie (tak samo możemy po Liście)
        for (String wartosc : przykladowySet) {
            // wypisujemy wartość z Setu - aktualnie z iteracji
            System.out.println(wartosc);
        }
//      LISTY
        // tworzymy Listę implementacja ArrayList
        List<String> przykladowaLista = new ArrayList<>();
//        obciąża procesor
//        nie ma wartości pustych!
//        praca na indeksach
        przykladowaLista.add("wartosc1");// 0 0
        przykladowaLista.add("wartosc2");//1 --
        // pobieramy wartość z indeksu 1
        String wartosc = przykladowaLista.get(1);//2 1
        // czy lista zawiera String "wartosc1"
        przykladowaLista.contains("wartosc1");
        // usuwamy wartość z listy, wartości nad tą usuniętą spadają indeksami o 1
        przykladowaLista.remove(1);
        // pod którym indeksem jest String "wartosc1" (lub -1 jak nie ma)
        int index = przykladowaLista.indexOf("wartosc2");
        // pobieramy wartość z Listy podając indeks
        przykladowaLista.get(index);
//      MAPY
//      klucz działa podobnie do indeksu
//      Integer - klucz, String - wartość
        // tworzymy Mapę, implementacja wybrana to HashMap
        // dodajemy klucz (wybrany przez generyczny typ Integer) i wartość (wybraliśmy String)
        Map<Integer, String> przykladowaMapa = new HashMap<>();
        przykladowaMapa.put(123, "sto dwadzieścia trzy");
        przykladowaMapa.put(12, "dwanaście");
        przykladowaMapa.put(12, "xyz");
        // pobieramy wartosc pod kluczem 12 z Mapy
        String value = przykladowaMapa.get(12);
        // usuwamy wartość pod kluczem 123
        System.out.println(value);


    }
}
