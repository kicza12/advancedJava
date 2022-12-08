package kolekcje.zadanie1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);
        System.out.println(values);
//        zamiana listy na set
//        najlepiej jest zamienić listę na set
//         ponieważ set nie przyjmuje dwóch tych samych wartości
        Set<Integer> uniqueSet = new HashSet<>(values);
        System.out.println(uniqueSet);
    }
}
