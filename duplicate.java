import java.util.Scanner;

public class duplicate {
          public static void main(String[] args) {
                    System.out.println("Enter the Size");
                    Scanner scan  = new Scanner (System.in);
                    int n = scan.nextInt();
                    int arr[] = new int[n];
                    System.out.println("Enter the Elements");
                    for (int i = 0; i < arr.length; i++) {
                            arr[i] = scan.nextInt();

                    }
                    for (int i = 0; i < arr.length; i++) {
                            for (int j = i+1; j < arr.length; j++) {
                                      if (arr[i] == arr[j] && i!=j) {
                                            System.out.println( " The duplicate elements" + arr[j]);    
                                      }
                            }  
                    }
          }
}
