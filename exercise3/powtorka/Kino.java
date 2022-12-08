package exercise3.powtorka;

//Stwórz klasę Kino która będzie miała w sobie zagnieżdżoną klasę Bilet i zagnieżdżoną statycznie klasę Sala.
//Z poziomu klasy Kino stwórz metodę która po pobraniu odpowiednich argumentów (nazwa filmu, godzina seansu itp.) wyda obiekt Bilet.
//Bilet powinien informować metodami o swojej cenie i zwracać obiekt Sali w której dojdzie do seansu.
public class Kino {
    public static final Sala SALA_1 = new Sala(4);


    public Bilet kupBilet(float cena, String nazwaFilmu, String godzinaSeansu) {
        return new Bilet(29.90F, nazwaFilmu, godzinaSeansu);
    }


    public class Bilet {
        private float cena;
        private String nazwaFilmu;
        private String godzinaSeansu;

        public Bilet(float cena, String nazwaFilmu, String godzinaSeansu) {
            this.cena = cena;
            this.nazwaFilmu = nazwaFilmu;
            this.godzinaSeansu = godzinaSeansu;
        }

        public String getNazwaFilmu() {
            return this.nazwaFilmu;
        }


        public String getGodzinaSeansu() {
            return this.godzinaSeansu;
        }

        public float getCena() {
            return this.cena;
        }

        public Sala getSala() {
            return Kino.SALA_1;
        }
    }


    public static class Sala {
        private int numerSali;

        public Sala(int numerSali) {
            this.numerSali = numerSali;
        }

        public int getNumerSali() {
            return numerSali;
        }
    }

}
