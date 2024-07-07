public class Is_Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,6,7,8,8};

        System.out.println("Is Array Sorted: " + isAscend(arr));
    }

    static boolean isAscend(int[] arr){
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}
