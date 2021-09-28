import java.sql.SQLOutput;
import java.util.Arrays;

public class compare {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 6, 8, 9, 0};
        int[] array2 = {2, 1, 6, 4, 9, 0};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("common elements in array are " +array1[i]);
                }
            }
        }
    }
}