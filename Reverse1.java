import java.util.Scanner;

class Reverse1{
          public static void main(String[] args) {
                    int res =0;
                    System.out.println("Enter the Number ");
                    Scanner scan = new Scanner(System.in);
                    int n = scan.nextInt();
                   while (n != 0) {
                     res = n%10;    
                     System.out.print(res);
                     n = n/10;
                    }
          }
}