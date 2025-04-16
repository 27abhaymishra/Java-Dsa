import java.util.*;
public class machines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = sc.nextInt();
        long min = Long.MAX_VALUE;

         long arr[] = new long[n];

         for(int i = 0 ; i<n; i++){
            arr[i] =sc.nextInt();
            min = Math.min(min,arr[i]);
            
         }
        
        long lo = 0 , hi = min * p ,ans=0;
        while(lo <= hi){
            long mid = (lo + hi) /2;
            long sum = 0;
            for(int i = 0; i<n; i++){
                sum += mid/arr[i];
            }
            if(sum >= p){
                ans = mid;
                hi = mid -1;
            }else{
                lo = mid + 1;
            }
        }
System.out.println(ans);
    }
}
