package klasyZGniazdkiem;

public class TopClass {

    public static class NestedClass {
        public int calculate() {
            return 1 + 1;
        }
    }

    public class InnerClass {
        private int innerNumber;

        public InnerClass(int giveNumber) {
            this.innerNumber = giveNumber;
        }

        public int getInnerNumber() {
            return innerNumber;
        }
    }

    public InnerClass createInnerClass() {
        return new InnerClass(10);
    }
}