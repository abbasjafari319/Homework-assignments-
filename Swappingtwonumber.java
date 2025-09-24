
package swappingtwonumber;

import java.util.Scanner;

public class Swappingtwonumber {

    public static void main(String[] args) {
       
        int a= 30;
        int b=20;
                System.out.println("a = "+a+"  b = "+b);
                a=a+b;
                b=a-b;
                a=a-b;
                System.out.println("a = "+a+"  b = "+b);
    }
    
}
