public class questionno2190 {
    public static void main(String[] args) {
        int nums [] = {1,100,200,1,100};
        int  key = 1;
        int hash [] = new int[201];

        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == key){
                hash[nums[i+1]]++;
            }
        }

        int ans = -1 , max = 0;
        for(int i = 0; i<hash.length-1; i++){
            if(hash[i] > max){
                ans = i;
                max = hash[i];
            }
        }
       System.out.println(ans);

    }
}
