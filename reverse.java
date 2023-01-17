import java.util.Scanner;

public class reverse {

            
          static boolean prime(int n)    

 {    

     int flag = 0;        

     for(int i = 2 ; i < n ; i++)    

     {    

         if(n % i == 0)    

         {    

             flag = 1;    

         }    

     }    

     if(flag == 1)  

     {    

         return false;    

     }    

     else    

     {    

         return true;    

     }    

 }    

 public static void main(String args[])    

 {    

     Scanner Sc = new Scanner(System.in);    

     String s, new_string = "";    

     System.out.println("Enter a string : ");    

     s = Sc.nextLine();    

     int len = s.length();    

     s = s.toLowerCase();    

     for(int i = 0 ; i < len ; i++)    

     {    

         char ch = s.charAt(i);    

         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')    

         {    

             int mul = i * 100;    

             int sum = 0;    

             for(int j = 2 ; j <= mul ; j++)    

             {    

                 if(prime(j))    

                 {    

                     sum = sum + j;    

                 }    

             }    

             while(sum > 9)    

             {    

                 int dig = 0;    

                 while(sum != 0)    

                 {    

                     dig = dig + sum%10;    

                     sum = sum/10;    

                 }    

                 sum = dig;    

             }    

             new_string = new_string + sum;  

         }    

         else    

         {    

             new_string = new_string + ch;    

         }    

     }    

     System.out.println("New string : " + new_string);
            }

  }        

