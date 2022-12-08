package obiektowosc.exercise1;

public class Circle {
    private final int r;

    public Circle(int r) {
        this.r = r;
    }
    public int getR(){
        return this.r;
    }
    public double obliczObwod() {
        return 2 * Math.PI * this.r;
    }

    public double obliczPole() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
