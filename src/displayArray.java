public class displayArray {

     public static <T> void display(T[] array) {
        for ( T value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
}
