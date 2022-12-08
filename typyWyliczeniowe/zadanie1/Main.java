package typyWyliczeniowe.zadanie1;

public class Main {
    public static void main(String[] args) {

        Continent[] kontynenty = Continent.values();
        for (Continent continents : kontynenty) {
            System.out.println(continents + " ---> " + continents.getPowierzchnia() + "mln km kwadratowych");
        }
        Continent najmniejszy = Continent.najmniejszyKontynent();
        Continent najwiekszy = Continent.najwiekszyKontynent();
        System.out.println(najmniejszy);
        System.out.println(najwiekszy);

    }
}
