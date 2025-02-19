public class question238 {
    public static void main(String[] args) {
        int nums [] = {-1 , 1 , 0 ,-3, 3};
        int n = nums.length;
        int prefix [] = new int [n];
          int suffix [] = new int [n];
           prefix[0] = 1;
         suffix[n-1] = 1;
         for(int i = 1 ; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
         }
         for(int i = n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1]; 
         }

         for(int i =0; i<n; i++){
            nums[i] = suffix[i] * prefix[i];
         }
for(int x : nums){
    System.out.print(x + " ");
}
    }
}
