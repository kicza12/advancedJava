package exercise3;

public class Main {
    public static void main(String[] args) {
        Kino naszeKino = new Kino(); // tworzymy instancję kina

        Kino.Bilet bilet1DoKina = naszeKino.kupBilet("Minionki", "19:00"); // kupujemy bilet, używamy metody w obiekcie naszeKino (instancja Kina) aby pobrać Bilet bo jest to inner klasa i tylko poprzez instancję Kina można stworzyć obiekt
        bilet1DoKina.getSala().getNumerSali(); // bilet posiada w sobie Getter do sali (który zwraca zmienną statyczną), w Sali jest możliwość sprawdzenia jej numeru

        Kino.Bilet bilet2DoKina = naszeKino.kupBilet("Minionki", "22:00"); // drugi bilet, oddzielny zupełnie obiekt, nowa instancja Biletu z innymi wartościami w fieldach
        bilet2DoKina.getSala().getNumerSali(); // też posiada możliwość pobrania sali i numeru do niej

        boolean toSamo = bilet1DoKina == bilet2DoKina; // oba stworzone bilety to dwa różne obiekty, nie są takie same
        boolean salaTaSama = bilet1DoKina.getSala() == bilet2DoKina.getSala(); // sale które zwracają te obiekty są takie same bo metody te zwracają jedną, tą samą zmienną stałą

        Kino.Sala salaKinowa = new Kino.Sala(2); // tworzymy nową salę poza kinem, możemy bo Sala to klasa zagnieżdżona STATYCZNA więc nie potrzebujemy instancji Kina aby stworzyć instancję Sali
    }
}
