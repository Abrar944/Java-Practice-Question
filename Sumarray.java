import java.util.Scanner;

public class Sumarray {
   public static void main(String[] args) {
             System.out.println("Enter the Size of Array");
             Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
             int arr[] = new int[n];
             for (int i = 0; i < n; i++) {
                       arr[i] = scan.nextInt();
             }
             int sum = 0;
             for (int i = 0; i < arr.length; i++) {
                     sum += arr[i];  
             }
             System.out.println(sum);
   }       
}
