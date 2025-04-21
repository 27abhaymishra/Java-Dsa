import java.util.*;
public class palindrome2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
    
      int count = 0;
      int left = 0;
      for(int i = 0 ; i<=s.length(); i++){

        if( i == s.length() || s.charAt(i) == ' '){
            int right = i-1;
           boolean f =  palindrome(s, right, left);
           if(f == true){
            count++;
           }
            left = i + 1;
        }
      }
      System.out.println(count);
    }

    
    public static boolean palindrome(String s , int right, int left){
        int l = left , r=right;
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
