public class question2404 {

    public static void main(String[] args) {

        int nums [] = {0,1,2,2,4,4,1};
        int hash [] = new int [5];

        for(int x : nums){
            hash[x]++;
        }
        int ans = -1, maxFreq = 0;
        for(int i =4; i>=0;  i-=2){
            if(hash[i] > maxFreq){
                ans = i;
                maxFreq = hash[i];
            }
        }

        System.out.println(ans);
    }
  
}
