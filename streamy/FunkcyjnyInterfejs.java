package streamy;
@FunctionalInterface
public interface FunkcyjnyInterfejs {
    int przyjmij(String a, int i , double d);
    default void wypiszLiczbe(int i){
        System.out.println(i);
    }
}
