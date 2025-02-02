import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        String [] cars = new String [n];
        // System.out.println(cars[0]);
        for(int i =0; i<n; i++){
            cars[i] = sc.next();
        }
        
        for(String x  : cars){
            System.out.print(x + "  ");
        }
}    
}
