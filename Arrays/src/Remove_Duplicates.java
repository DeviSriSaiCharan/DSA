import java.util.HashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4,5,5};

        System.out.println("--> Brute Force: ");
        HashSet<Integer> list = Brute_Force(arr);
        System.out.println(list);
        System.out.println("Length of Array: " + list.size());

        System.out.println("--> Optimal: ");
        System.out.println("Length of Array: " + Optimal(arr));
    }

    static HashSet<Integer> Brute_Force(int[] arr){
        //Here we used set because it doesn't contain duplicates.
        //We can also do without HashSet, if it is sorted.

        HashSet<Integer> list = new HashSet<>();    // S.C :- O(n)

        for (int j : arr) {  //O(n)
            list.add(j);     // O(log(n))
        }
                            // T.C :- O(n*log(n))
        return list;
    }

    static int Optimal(int[] arr){
        //2 Pointer approach
        //Only move j
        //i --> if it points to 1
        //j --> it looks for the one that was not i, where j > i.
        //replace i+1 with j

        int i=0;
        for(int j=1 ; j<arr.length ; j++){     // O(n)
            if(arr[i] == arr[j]) j++;
            else {
                i++;
                arr[i] = arr[j];
            }
        }
                                 // S.C :- O(1)
        return i+1;
    }
}
