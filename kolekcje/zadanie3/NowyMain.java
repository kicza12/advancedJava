package kolekcje.zadanie3;

import java.util.*;

public class NowyMain {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("", "");
//        metody Collections
        lista = Collections.emptyList();
//        nie można już nic dodać
        List<Integer> lista1 = List.of(1,2);

        Car car1 = new Car("BMW", "spalinowy");
        Car car2 = new Car("Tesla", "elektryczny");
        Car car3 = new Car("Audi", "hybrydowy");
        Car car4 = new Car("BMW", "spalinowy");//ten sam hashCode co car1
        Car car6 = new Car("BMW", "elektryczny");
        Car car5 = car1;
        System.out.println(car5 == car1);//true
        System.out.println(car1 == car1);//true
        System.out.println(car1 == car2);//false
        System.out.println(car1 instanceof Car);//true
        System.out.println(car1.equals(car2));//false
        System.out.println(car1.hashCode() == car6.hashCode());//true
//       W Set'cie nie ma kolejności
        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car6);
        cars.add(car2);
        cars.forEach(System.out::println);


    }
}
