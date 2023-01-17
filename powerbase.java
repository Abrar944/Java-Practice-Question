public class powerbase {
   
          public static void main(String[] args) {
                    int b= 5;
                    int p= 5;
                    int res = b;

                    if (p % 2 == 1) {
                              res = p/2;
                              for (int i = 0; i < 2; i++) {
                              
                              res = res*res;
                              
                              
                              }
                              res = res*res;
                              res = res*p;
                    }

                    
                    else{
                              res = p/2;
                              for (int i = 0; i < 2; i++) {
                                        res = res*res;
                              }
                    }
                    System.out.println(" the Answer is "  + res);
                    
                              
                    
          }

}  
