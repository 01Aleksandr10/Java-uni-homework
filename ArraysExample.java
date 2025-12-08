import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        /*Практика 1
        а1 теперь будет ссылаться на тот же объект, что и а2, а на первый объект не будет ни одной ссылки
         */

        //Практика 2

        int[] array1 = {5, 2, 8, 1, 9};
        int[] array2 = {5, 2, 8, 1, 9};
        int[] array3 = {5, 2, 8, 1, 10};
        int[] sortedArray = {1, 2, 5, 8, 9};

        System.out.println("Arrays.toString():");
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println("Arrays.sort():");
        System.out.println("До: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("После: " + Arrays.toString(array1));
        System.out.println();

        System.out.println("Arrays.binarySearch():");
        int index = Arrays.binarySearch(sortedArray, 5);
        if (index >= 0) {
            System.out.println("Элемент 5 на" + index);
        } else {
            System.out.println("нету");
        }
        System.out.println();

        System.out.println("Arrays.equals():");
        System.out.println("array1 == array2: " + Arrays.equals(array1, array2));
        System.out.println("array1 == array3: " + Arrays.equals(array1, array3));
        System.out.println();

        System.out.println("Arrays.compare():");
        System.out.println("compare(array1, array2): " + Arrays.compare(array1, array2));
        System.out.println("compare(array1, array3): " + Arrays.compare(array1, array3));
        System.out.println("compare(array3, array1): " + Arrays.compare(array3, array1));

    }
}
