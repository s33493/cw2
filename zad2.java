import java.util.Arrays;

public class zad2 {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2,2};
        int[] array2 = {1, 2, 3,4};
        int[] array3 = {5, 5, 5, 5, 1};
        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }

    public static int findDominant(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return array[i];
            }
        }
        return -1;
    }
}
