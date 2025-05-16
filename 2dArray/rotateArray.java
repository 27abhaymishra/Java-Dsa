//rotate a 2D Array by 90 deg
import java.util.*;
public class rotateArray {

    public static void print(int[][] arr){
        int m = arr.length; int n = arr[0].length;

        for(int i = 0; i<m;  i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
       int[][] arr = new int[m][m];

       for(int i = 0; i<m; i++){
        for(int j =0; j<m; j++){
            arr[i][j] = sc.nextInt();
        }
       }
       print(arr);
//Transpose
        for(int i = 0; i<m; i++){
        for(int j =0; j<i; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
       }
print(arr);

//rotate by 90 deg

    for(int i = 0; i<m; i++){
       int a = 0 ,b = m-1;

       while(b > a){
        int temp = arr[i][a];
        arr[i][a] = arr[i][b];
        arr[i][b] = temp;
        a++ ;b--;
       }
       }
print(arr);
    }
}
