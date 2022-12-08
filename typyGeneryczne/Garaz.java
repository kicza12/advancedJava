package typyGeneryczne;

import vehicle.Car;
//public class Garaz<T extends Car, E extends Rower> {
// klasa która przyjmuje obowiązkowo 2 parametry, T który musi dziedziczyć po klasie Car i E który musi implementować interfejs Rower (oba używają słowa extends)

//    private T samochod; // field typu który zostanie podany do parametru T
//    private E rower; // field podany to parametru E
//
//    public Garaz(T samochod, E rower) { // konstruktor który przyjmuje 2 argumenty, 1 typu parametru generycznego T, drugi E
//        this.samochod = samochod; // zapisujemy podane wartości do pól
//        this.rower = rower; // zapisujemy
//    }
//
//    public Garaz(E rower) { // drugi konstruktor, jeden argument typu generycznego E
//        this.rower = rower;
//    }
//
//    public Garaz(T samochod) { // konstruktor z samym T
//        this.samochod = samochod;
//    }
//
//    public void setRower(E rower) { // setter który przyjmuje rower typu podanego z typu generycznego E
//        this.rower = rower;
//    }
//
//    public E getRower() { // getter do roweru, zwrócony zostanie typ z parametru generycznego E
//        return this.rower;
//    }
//
//    public T getCar() { // samochód, typu z parametru T
//        return this.samochod;
//    }
//}
//
