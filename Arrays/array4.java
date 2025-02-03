//reverse an array by using swaping last index with first and so on

public class array4 {
    public static void main(String[] args) {
        int arr [] = {7,2,1,5,6,8};
        int n = arr.length;
        for(int i = 0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
 for(int x : arr){
    System.out.print(x + " ");
 }
    }
}
