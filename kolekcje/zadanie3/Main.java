package kolekcje.zadanie3;

import java.util.LinkedList;
import java.util.Queue;

//Napisz klasę Car, która będzie zawierać pola nazwa i rodzaj samochodu.
//Stwórz kolejkę Samochódw.
//- Dodaj kilka samochodów do kolejki.
//- przeiteruj po wszystkich dostępnych samochodach
//- zaprezentuj działanie metody peek(), pop()
public class Main {
    public static void main(String[] args) {
        Queue<Car> queue = new LinkedList<>();
        queue.add(new Car("Porsche","Sportowy"));
        queue.add(new Car("Audi","Sedan"));
        queue.add(new Car("BMW","Kombi"));
        for (Car car : queue) {
            System.out.print(car.getNazwa() + " ");
            System.out.println(car.getRodzajSamochodu());
        }
        System.out.println("---------");
        Car zUsunieciem = queue.poll();
        for (Car car : queue) {
            System.out.print(car.getNazwa() + " ");
            System.out.println(car.getRodzajSamochodu());
        }
        System.out.println("---------");
        Car bezUsuniecia = queue.peek();
        System.out.println("Zastosowanie metody peek(): " + bezUsuniecia.getNazwa() + " " + bezUsuniecia.getRodzajSamochodu());
        System.out.println("-----------");
        for (Car car : queue) {
            System.out.print(car.getNazwa() + " ");
            System.out.println(car.getRodzajSamochodu());
        }
        System.out.println("-----------");
        for (Car car : queue) {
            System.out.print(car.getNazwa() + " ");
            System.out.println(car.getRodzajSamochodu());
        }





    }
}
