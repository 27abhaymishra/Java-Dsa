public class evenSum {
    public static void main(String[] args) {
  
           int num = 30;  
        int evencount = 0;  

        for (int i = 1; i <= num; i++) {  
            int sum = 0; // Reset sum for each number  
            
            int temp = i; // Use a temporary variable to manipulate `i`  
            while (temp > 0) {  
                sum += temp % 10; // Add the last digit to sum  
                temp = temp / 10; // Remove the last digit  
            }  
            if (sum % 2 == 0) {  
                evencount++; // Increment count if the sum is even  
            }  
        }  
        System.out.println(evencount); // Output the count of even sums  
    
    }
}
