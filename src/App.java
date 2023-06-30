public class App {
    public static void main(String[] args) throws Exception {
        
        
        Integer[] intArray = { 1, 2, 3};
        Double[] doubleArray = {1.2 , 2.2 , 3.3};
        Character[] characterArray = { 'a', 'b', 'c'};
        String[] stringArray = { "a", "b", "c" };

        displayArray.display(intArray);
        displayArray.display(doubleArray);
        displayArray.display(characterArray);
        displayArray.display(stringArray);
        
        System.out.println(displayArray.getFirst(intArray));
        System.out.println(displayArray.getFirst(doubleArray));
        System.out.println(displayArray.getFirst(characterArray));
        System.out.println(displayArray.getFirst(stringArray));

    }

   
}
