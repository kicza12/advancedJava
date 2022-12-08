package typyGeneryczne;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // tworzymy kolejkę, wybrana implementacja to LinkedList

        queue.add("element1");
        // dodajemy do kolejki element1 (zgodny z podanym typem generycznym)
        queue.add("element2");
        // dodajemy element 2

        String zUsunieciem = queue.poll();
        // pobrane zostanie: element1 i usunięte z kolejki
        String bezUsuniecia = queue.peek();
        // pobrane zostanie: element2 bez usuwania z kolejki

        Deque<String> deque = new LinkedList<>();
        // wariacja kolejki, interfejs Deque pozwala na pobieranie i dodawanie wartości od końca i początku kolejki, zwykłe Queue po dodaniu wartości tylko pierwsze dodane wartości są możliwe do pobrania


    }


}
