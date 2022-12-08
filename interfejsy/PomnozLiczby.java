package interfejsy;

public class PomnozLiczby implements Kalkulator {
    private int number1, number2;

    @Override
    public int giveResult() {
        return this.number1 * this.number2;
    }

    @Override
    public void readNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

    }
}

