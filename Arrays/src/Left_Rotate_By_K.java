import java.util.Arrays;

public class Left_Rotate_By_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;

//        System.out.println("--> Brute Force: " + Arrays.toString(Brute_Force(arr, k)));
//        System.out.println("--> Better: " + Arrays.toString(Better(arr, k)));
        System.out.println("--> Optimal: " + Arrays.toString(Optimal(arr, k)));
    }

    static int[] Brute_Force(int[] arr, int k) {
        k = k % arr.length;

        for (int i = 1; i <= k; i++) {
            Rotate(arr);
        }

        return arr;
    }

    static int[] Better(int[] arr, int k) {
        k = k % arr.length;

        int[] temp = new int[k];
        System.arraycopy(arr, 0, temp, 0, k);

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - k)];
        }

        return arr;
    }

    static int[] Optimal(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        return arr;
    }

    static void Rotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;


    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
