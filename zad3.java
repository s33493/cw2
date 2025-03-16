public class zad3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        int[] rotatedArray1 = rotateArray(array1, 2);
        int[] rotatedArray2 = rotateArray(array2, 3);

        System.out.println(java.util.Arrays.toString(rotatedArray1));
        System.out.println(java.util.Arrays.toString(rotatedArray2));
    }

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        positions = positions % n; 
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + positions) % n] = array[i];
        }

        return result;
    }
}