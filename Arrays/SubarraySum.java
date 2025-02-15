public class SubarraySum {
    public static void main(String[] args) {
        int arr [] = {4,2,3,6};
        int n= arr.length;
        
        for(int i = 0; i<n; i++){
            for(int j =i; j<n; j++){
                int sum =0 ;
                for(int k = i; k<=j; k++){
                    sum +=arr[k];
                }
             
                System.out.println(sum);
            }
        }
    }
}

