
import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        String arr[] = s.split(" ");
        for(int i = 0 ; i<arr.length; i++){
          boolean f = palindrome(arr[i]);
          if(f == true){
            count++;
          }
        }
        System.out.println(count);

    }

    public static boolean palindrome(String s){
        int l = 0 , r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                    return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
