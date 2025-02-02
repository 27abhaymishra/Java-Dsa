public class array1 {

    public static void main(String[] args) {
        // int arr [] = new int [5];
        // int arr [] = {2,1,27,21,10};
        // System.out.println(arr[3]);
        // // System.out.println(arr[5]);
        // // System.out.println(arr[-2]);
        // System.out.println(arr);
        // System.out.println(arr.length);
        // char arr [] = {'A' , 'b' ,'h','a','y'};
        // System.out.println(arr);
      int arrr [] = {4,1,2,3,6,7,4};
      for(int i =0; i<arrr.length; i++){
    //     System.out.println(arrr[i]);
        arrr[i] = 5;
      }
      for(int x :arrr){
        // System.out.print(x + " ");
        x =10;
        // System.out.print(x + " ");
      }
      for(int x :arrr){
        System.out.print(x + " ");
      }

    }
}