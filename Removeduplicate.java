import java.util.Arrays;
import java.util.Scanner;

public class Removeduplicate {
    public static void main(String[] args) {
          System.out.println("Enter the Size");
          Scanner scan  = new Scanner (System.in);
          int n = scan.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter the Elements");
          for (int i = 0; i < arr.length; i++) {
                  arr[i] = scan.nextInt();

          }
        //   Arrays.sort(arr);
          int j =0;
          int temp[] = new int[arr.length];
          
          for (int i = 0; i < arr.length-1; i++) {
                  if (arr[i]!=arr[i+1]) {
                            temp[j] = arr[i];
                            j++; 
                  }
          }
          temp[j] = arr[arr.length-1];  
          for (int i = 0; i < temp.length; i++) {
                  System.out.println( " The Answer is " + temp[i]);  
          }
    }      
}
