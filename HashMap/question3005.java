
import java.util.Scanner;

public class question3005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n = sc.nextInt();
        int nums [] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int hash [] = new int [101];

        for(int x : nums){
            hash[x]++;
        }
        int max = 0;
        for(int i = 0; i<101; i++){
            max = Math.max(max, hash[i]);
        }
        int count = 0;
        for(int i = 0; i<101; i++){
            if(max == hash[i]){
                count++;
            }
        }

System.out.println(count * max);

    }
}
