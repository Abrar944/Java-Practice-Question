import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
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
System.out.print( "The Samllest Number Is " + arr[1] );
  }        
}
