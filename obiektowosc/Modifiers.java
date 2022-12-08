package obiektowosc;

public class Modifiers {
    //    Access Modifiers (modyfikatory dostępu) z polami klasy (mogą być statyczne):
    public int field1;
    protected int field2;
    //    protected - daje dostęp dla całej paczki
    int field3;
    private int field4;

    //    KONSTRUKTOR - metoda, która się odpala podczas tworzenia obiektu
    public Modifiers(int argument1) {
        this.field4 = argument1;
    }
}
