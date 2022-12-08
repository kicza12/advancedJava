package klasyZGniazdkiem;

public class Main {
    public static void main(String[] args) {
            TopClass.NestedClass nested = new TopClass.NestedClass();
            nested.calculate();

            TopClass topClass = new TopClass();
            TopClass.InnerClass inner = topClass.createInnerClass();
            inner.getInnerNumber();
        }
    }













