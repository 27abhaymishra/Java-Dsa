import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String s = sc.next();
            int l = 0 , r = s.length()-1;
            boolean check = true;

            while(l < r){

                if(s.charAt(l) != s.charAt(r)){
                    System.out.println("Not Palindrome");
                    check = false;
                    break;
                    
                }
                l++;
                r--;
            }

            if(check == true){
                System.out.println("Palindrome");
            }


    }
}
