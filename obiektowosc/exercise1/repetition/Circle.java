package obiektowosc.exercise1.repetition;

public class Circle {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public void obliczPole(int r) {
        System.out.println(Math.PI * r * r);
    }

    public void obliczObwod(int r) {
        System.out.println(2 * Math.PI * r);
    }
}
