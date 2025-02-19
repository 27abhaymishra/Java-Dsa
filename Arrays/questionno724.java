public class questionno724 {
    //find Pivot index

    public static void main(String[] args) {
        int nums [] = {1,7,3,6,5,6};
        int n = nums.length;
        int prefix [] = new int [n];
        int suffix [] = new int [n];
           prefix[0] = nums[0];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        suffix[n-1] = nums[n-1];
        for(int i =n-2; i>=0; i--){
             suffix[i] = suffix[i+1] + nums[i];
        }

       for(int i = 0; i<n; i++){
        if(suffix[i] == prefix[i]){
            System.out.println(i);
        }
       }
    }
}
