import java.util.Scanner;

public class tax {
         
            public static void main(String[] args) {
                      System.out.println("Enter the Number");
                    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = 0;
		   int arr[] = new int[n];
                       for (int i = 0; i < arr.length; i++) {
                               arr[i] = scan.nextInt();  
                       }
		   for (int i = 0; i < arr.length; i++) {
                               if (arr[i]<1000) {
                                         System.out.println("0");
                               } else {
                                         temp = arr[i]/10;
                                      System.out.println(temp);   
                               }  
                       }
          
}
}
