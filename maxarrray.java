import java.util.Scanner;

public class maxarrray {
   public static void main(String[] args) {
          System.out.println("Enter the Size of Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          System.out.println("Enter the Number ");
          int b = scan.nextInt();
          int arr[]  = new int[n];
          System.out.println("Enter the Numbers");
          for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                  }
                  int temp =1;
         for (int i = 0; i < b; i++) {
                   if (arr[i]!=0) {
                        temp+= arr[i];     
                   } 
         }
         System.out.println(  "The Answer is"  +temp);
          }       
}
