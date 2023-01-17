import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
              System.out.println("Enter the String");
              Scanner scan = new Scanner(System.in);
              String n = scan.nextLine();
              int len  =  0;
              len  =  n.length();
              String rev = " ";
              for (int i = len-1; i >= 0; i--) {
                        rev = rev  + n.charAt(i);

              }
              System.out.println(rev);
    }      
}
