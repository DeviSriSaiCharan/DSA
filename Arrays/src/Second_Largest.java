import java.util.Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,10};

        System.out.println("--> Brute Force:");
        System.out.println("Second Larges: " + Brute_Force(arr));

        System.out.println("--> Better Solution: ");
        System.out.println("Second Largest: " + Better(arr));

        System.out.println("--> Optimal Solution: ");
        System.out.println("Second Largest: " + Optimal(arr));
    }

    static int Brute_Force(int[] arr){
        Arrays.sort(arr);

        for(int i=arr.length-2 ; i>=0 ; i--){
            if(arr[i] != arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;
    }

    static int Better(int[] arr){
        int f_largest = arr[0];
        int f_smallest = arr[0];

        for(int num : arr){
            if(f_largest < num){
                f_largest = num;
            }
            if(f_smallest > num){
                f_smallest = num;
            }
        }

        int s_largest = Integer.MIN_VALUE;
        int s_smallest = Integer.MAX_VALUE;

        for(int num : arr){
            if(s_largest < num && num < f_largest){
                s_largest = num;
            }
            if(s_smallest > num && num > f_smallest){
                s_smallest = num;
            }
        }

        return s_largest;
    }

    static int Optimal(int[] arr){

        // If present num is max then the value of its previous is 2nd largest..😎
        int f_largest = arr[0];
        int s_largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(f_largest < num){
                s_largest = f_largest;
                f_largest = num;
            } else if (num > s_largest && num < f_largest) {
                s_largest = num;
            }
        }

        return s_largest;
    }
}
