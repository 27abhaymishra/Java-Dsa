import java.util.*;  

public class binarySearch {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the size of the array n:");  
        int n = sc.nextInt();  
        System.out.println("Enter your target element:");  
        int target = sc.nextInt();  

        int arr[] = new int[n];  
        System.out.println("Enter " + n + " elements:");  

        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }  

        System.out.println("Array before sorting:");  
        System.out.println(Arrays.toString(arr));  

        Arrays.sort(arr);  
        System.out.println("Array after sorting:");  
        System.out.println(Arrays.toString(arr));  

        int left = 0, right = arr.length - 1;  
        boolean found = binarySearch(arr, target, left, right);  
        if (found) {  
            System.out.println("Number " + target + " is found in the array.");  
        } else {  
            System.out.println("Number " + target + " not found in the array.");  
        }  
    }  

    public static boolean binarySearch(int arr[], int target, int left, int right) {  
        while (left <= right) { // Allow checking the rightmost element  
            int mid = (left + right) / 2;  
            if (arr[mid] == target) {  
                return true;  
            }  
            if (arr[mid] > target) {  
                right = mid - 1;  
            } else { // Use else here because if arr[mid] < target, we do this  
                left = mid + 1;  
            }  
        }  
        return false;  
    }  
}  