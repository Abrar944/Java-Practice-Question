import java.util.Scanner;

public class Average {
   public static void main(String[] args) {
          System.out.println("Enter the Size of Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter the Numbers in Array");
          for (int i = 0; i < arr.length; i++) {
                  arr[i] = scan.nextInt();

          }
          int temp = 0;
          for (int i = 0; i < arr.length; i++) {
                    temp  += arr[i];  

          }   
          System.out.println(   "The Average Of the Array  :" + temp/n);
   }       

}
