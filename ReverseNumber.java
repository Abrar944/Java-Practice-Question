import java.util.Scanner;





public class ReverseNumber {

          static void reverse(int arr[], int n)
          {
                    int low = 0, high = n - 1;
      
                    while(low < high)
                    {
                              int temp = arr[low];
      
                              arr[low] = arr[high];
      
                              arr[high] = temp;
      
                              low++;
                              high--;
                    }
          }
     public static void main(String[] args) {
          System.out.println("Enter the Size of Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[]  = new int[n];
          System.out.println("Enter the Numbers");
          for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                  }
                  
                  reverse(arr, n);
                  for (int i : arr) {
                          System.out.println( " the Answer is" + i);  
                  }
                   }     
}
