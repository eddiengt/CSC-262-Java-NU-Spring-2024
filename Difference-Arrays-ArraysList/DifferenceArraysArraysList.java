import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArraysList {

    public static void main(String[] args) {
        // Arrays
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));

        // ArrayLists
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("ArrayList: " + arrayList);

    
        // Size
        int sizeOfArray = array.length;
        int sizeOfArrayList = arrayList.size();
        System.out.println("Size of array: " + sizeOfArray);
        System.out.println("Size of ArrayList: " + sizeOfArrayList);

        // Arrays cannot dynamically grow, so a new array must be created
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = 6;
        System.out.println("New array: " + Arrays.toString(newArray));

        // ArrayLists can dynamically grow
        arrayList.add(6);
        System.out.println("New ArrayList: " + arrayList);

        // Iterating through array 
        System.out.println("Iterating through array :");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nIterating through ArrayList :");
        for (int value : arrayList) {
            System.out.print(value + " ");
        }
    }
}