import java.util.Arrays;
import java.util.Scanner;

class magic{
          public static void main(String[] args) {
                    int res = 0;
                    int add =0;
                    System.out.println("Enter the Number of Inputs");
                    Scanner scan = new Scanner(System.in);
                    int n = scan.nextInt();
                    int arr[] = new int[n];
                    System.out.println("Enter the Numbers");
                    for (int i = 0; i < arr.length; i++) {
                              arr[i] = scan.nextInt();
                    }
                       Arrays.sort(arr);
                  for (int i : arr) {
                          System.out.println(" The Sort array  "  + i);  

                           if (i<99) {
                                     int temp1 =0;
                                   int temp = i;
                                   temp = temp1;
                                    res = temp1%10;
                                   System.out.println(res);
                              //      temp1 = temp1/10;
                              //      res +=res;

                           }
                    }  
                    // System.out.println(res);

          }
}