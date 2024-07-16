import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,0,0,4,0,5};

        System.out.println("--> Brute Force: " + Arrays.toString(Brute_Force(arr)));

        System.out.println("--> Optimal: " + Arrays.toString(Optimal(arr)));
    }

    static int[] Brute_Force(int[] arr){
        int[] sol = new int[arr.length];

        int i=0;
        for(int num : arr){
            if(num != 0){
                sol[i++] = num;
            }
        }

        for(int j=i ; j<arr.length ; j++){
            sol[i] = 0;
        }

        return sol;
    }

    static int[] Optimal(int[] arr){
        int zeroPointer = arr.length;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                zeroPointer = i;
                break;
            }
        }

        for(int j=zeroPointer + 1 ; j<arr.length ; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[zeroPointer];
                arr[zeroPointer] = temp;
                zeroPointer++;
            }
        }

        return arr;
    }
}
