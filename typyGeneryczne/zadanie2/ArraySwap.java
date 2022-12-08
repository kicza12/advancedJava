package typyGeneryczne.zadanie2;

public class ArraySwap<T> {
    public <T> T[] swapArray(T[] array, int index1, int index2) {
        T object1 = array[index1], object2 = array[index2];
        array[index1] = object2;
        array[index2] = object1;
        return array;
    }


}
