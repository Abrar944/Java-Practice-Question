import java.util.Scanner;

public class Rotation {
          
          public static void main(String[] args) {
                    System.out.println("Enter the Size of Array");
                    Scanner scan = new Scanner(System.in);
                    int n = scan.nextInt();
                    // System.out.println("Enter the Kth Element ");
                    // int k = scan.nextInt();
                    int arr[]  = new int[n];
                    System.out.println("Enter the Numbers");
                    for (int i = 0; i < n; i++) {
                              arr[i] = scan.nextInt();
                    }
                    
                      int temp1, temp2 =0;
                      temp1 = arr[1];
                      temp2 = arr[0];
                      for (int i = 2; i < arr.length; i++) {
                            arr[i-2] = arr[i];
                            
                            
                        }
                        arr[n-1] = temp1;
                        arr[n-2] = temp2;
                      for (int i : arr) {
                              System.out.println(" the Answer Is " +  i);  
                      }
                            
          }
}
