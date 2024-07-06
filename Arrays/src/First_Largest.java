import java.util.Arrays;

public class First_Largest{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("--> Brute Force:");
        System.out.println("First Largest Number: " + Brute_Force(arr));
        System.out.println("--> Optimal:");
        System.out.println("First Largest Number: " + Optimal(arr));
    }

    static int Brute_Force(int[] arr){
        Arrays.sort(arr);   // O(nlogn)

        return arr[arr.length-1];
    }

    static int Optimal(int[] arr){

        int largest = arr[0];
        for(int num : arr){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }
}