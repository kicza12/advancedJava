package exercise3;

//Stwórz klasę Kino która będzie miała w sobie zagnieżdżoną klasę Bilet i zagnieżdżoną statycznie klasę Sala.
//Z poziomu klasy Kino stwórz metodę która po pobraniu odpowiednich argumentów (nazwa filmu, godzina seansu itp.) wyda obiekt Bilet.
//Bilet powinien informować metodami o swojej cenie i zwracać obiekt Sali w której dojdzie do seansu.
public class Kino {

    public Bilet kupBilet(String film, String godzina) { // metoda w klasie Kino która tworzy Inner Klasę (zagnieżdżoną) Bilet
        return new Bilet(30d, film, godzina); // utwórz instancję Biletu i zwróć w metodzie, użyj argumentów podanych do metody
    }

    public static final Sala SALA_1 = new Sala(1);
    // stwórz statyczną zmienną stałą (constant) z salą, Nested static class (zagnieżdzona statyczna) dostępna globalnie w kodzie

    public class Bilet {
        // definicja Inner klasy
        private String film;
        // fieldy
        private String godzina;
        private double cena;

        public Bilet(double cena, String film, String godzina) {
            // konstruktor klasy Bilet
            this.cena = cena;
            this.film = film;
            this.godzina = godzina;
        }

        public double getCena() {
            // gettery
            return this.cena;
        }

        public String getFilm() {
            return this.film;
        }

        public String getGodzina() {
            return this.godzina;
        }

        public Sala getSala() {
            // getter zwracający salę, zwraca on nie field z klasy Bilet a stałą z klasy Kino
            return Kino.SALA_1;
        }
    }

    public static class Sala {
        // Nested static class, zagnieżdżona klasa statyczna niepotrzebująca instancji klasy Kino aby stworzyć jej instancję
        private int numerSali;

        public Sala(int numer) {
            this.numerSali = numer;
        }

        public int getNumerSali() {
            return this.numerSali;
        }
    }
}