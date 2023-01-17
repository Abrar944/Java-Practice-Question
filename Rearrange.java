import java.util.Arrays;
import java.util.Scanner;

public class Rearrange {
 
          public static void main(String[] args) {
                    
          System.out.println("Enter the Size of Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[]  = new int[n];
          System.out.println("Enter the Numbers");
          for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                  }
                  Arrays.sort(arr);
                  for (int i : arr) {
                            
                            System.out.println(" The Rerange array is : " + i);        
                  }
                             
                  

          }
}
