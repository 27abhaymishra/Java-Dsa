public class subarray {

    public static void main(String[] args) {
        int arr [] = {4,2,3,6};
        int n= arr.length;
        
        // for(int i = 0; i<n; i++){
        //     for(int j =i; j<n; j++){
        //        for(int k = i; k<=j; k++){
        //             System.out.print(arr[k] + " ");
        //           }
        //         System.out.println();
           
        //     }
        // }


        // optimise O(n^2)
// for(int i = 0; i<n; i++){
//     int sum = 0;
//     for(int j = i; j<n; j++){
//         sum +=arr[j];
//         System.out.println(sum);
//     }
// }
// int n = nums.length;
int maxsum = 0;
for(int i = 0; i<n; i++){
 int sum = 0;
 for(int j = i; j<n; j++){
      sum +=arr[j];
      maxsum = Math.max(maxsum , sum);
 }
}  

System.out.println(maxsum);

    }
}
