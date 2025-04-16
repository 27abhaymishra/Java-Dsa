import java.util.*;
public class Hamburger {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter your Recipe : ");
         String s = sc.nextLine();

         int rb = 0 , rs =0 , rc = 0;

         for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'B')  {
                rb++;
            } 
            if(s.charAt(i) == 'S')  {
            rs++;
           } 
           if(s.charAt(i) == 'C')
             rc++;
           }
           
        //    System.out.println("Enter your avaible bread: ");
         int ab = sc.nextInt();
        //  System.out.println("Enter your avaible sausage: ");
         int as=sc.nextInt();
        //  System.out.println("Enter your avaible cheese: ");
         int ac = sc.nextInt();
        //  System.out.println("Enter the price of 1 bread:");
         int pb=sc.nextInt();
        //  System.out.println("Enter the price of 1 sausage: ");
         int ps=sc.nextInt();
        //  System.out.println("Enter the price of 1 cheese: ");
         int pc=sc.nextInt();
        //  System.out.println("Enter Amount of money you have : ");
         long r = sc.nextLong();
      
        long lo = 0 , ans = 0;
        long hi =(long)1e13;
        while(lo <= hi){
            long mid = lo + (hi-lo)/2;
               long reqb = Math.max((rb * mid -ab) ,0)*pb;
               long reqs = Math.max((rs * mid -as) ,0)*ps;
               long reqc = Math.max((rc * mid  -ac ),0)*pc;
               long tp = reqb + reqs + reqc;
                  if(tp <= r){
                    ans = mid;
                    lo = mid + 1;
                  }else{
                    hi = mid -1;
                  }
        }

        System.out.println(ans);

    }

}

