import java.util.Scanner;

public class checkcondition {
        public static void main(String[] args) {
                  System.out.println("Enter the String");
                  int vowles = 0;
                  int space = 0;
                  Scanner scan = new Scanner(System.in);
                  String n = scan.nextLine();
                  for (int i = 0; i < n.length(); i++) {
                            char str = n.charAt(i);
                            if (str == 'a'||str == 'e'||str == 'o'||str == 'i'||str == 'u' ) {
                                 vowles++;
                             
                              }
                              else if(str == ' ' ){
                               space++;
                              }
                  }
                  System.out.println(vowles);
                  System.out.println(space);
        }
}
