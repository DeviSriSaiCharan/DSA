import java.util.Arrays;

public class Left_Rotate_By_One {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("--> Brute Force: " + Arrays.toString(Optimal(arr)));
        System.out.println();
    }
    static int[] Optimal(int[] arr){
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
