package typyGeneryczne.zadanie1;

public class Main {

        public static void main(String[] args) {
            Pair<Integer, String> value1 = new Pair<>(33, "trzydzieści trzy");
            // tworzymy zmienną typu klasy Pair z parametrami generycznmi Integer, String, wartości podajemy w konstruktorze tak jak musimy

            Pair<String, Integer> para1 = Main.readArgument("", 1);
            // tutaj tworzymy Pair przy pomocy metody z jej parametrami generycznymi, nie ma znaków <> przed nazwą metody, bo kompilator wie jakie typy generyczne ma metoda z wartości podanych jako argumenty tej metody
            Pair<Integer, String> para2 = Main.readArgument(1, "");
            Pair<String, Integer> para3 = Main.<String, Integer>readArgument("", 1); // ale możemy podać te typy jeśli chcemy
        }

        public static <T, F> Pair<T, F> readArgument(T arg0, F arg1) { // definicja metody z jej parametrami generycznmi, zwraca ona obiekt klasy Pair która też ma parametry i są one takie same jak te podane do metody, metoda pobiera argumenty
            Pair<T, F> pair = new Pair<>(arg0, arg1); // tworzymy obiekt klasy Pair, parametry jak metody, argumenty podane do metody

            return pair; // zwracamy stworzony obiekt
        }
    }

