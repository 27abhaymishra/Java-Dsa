import java.util.ArrayList;
import java.util.Scanner;

public class Mostfrequent {

    public static int mostFrequent( ArrayList<Integer>nums , int key){
       int[] count = new int[1001];

       //building our count array

       for(int i = 1; i<nums.size(); i++){
        if(nums.get(i-1) == key){
            count[nums.get(i)]++;
        }
       }

       //finding the index with greatest entry
       int maxIndex = 0;
       for(int i = 0; i<count.length; i++){
        maxIndex = count[i] > count[maxIndex] ? i : maxIndex;
       }
       return maxIndex;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();

    ArrayList<Integer>arr = new ArrayList<>();

    for(int  i = 0; i<n; i++){
        int num = sc.nextInt();
        arr.add(num);
    }
    int ans = mostFrequent(arr , k );
    System.out.println( "Maximum Occurance : " + ans);
   } 
}
