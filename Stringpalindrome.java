import java.util.Scanner;

public class Stringpalindrome {
          boolean ispalindrone(String n ){
                    int begin = 0;
                    int end = 0;
                    while (begin< end) {
                              if (n.charAt(begin)!=n.charAt(end)) {
                                   return false;     
                              }
                              begin++;
                              end--;
                              
                    }
                    return true;

          }
          public static void main(String[] args) {
                    System.out.println("Enter the String ");
                    Scanner scan = new Scanner(System.in);
                   String n = scan.nextLine();
                   Stringpalindrome obj = new Stringpalindrome();
                   System.out.println(obj.ispalindrone(n));
          }
}
