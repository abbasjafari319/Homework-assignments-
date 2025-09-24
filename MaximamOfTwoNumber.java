
package maximamoftwonumber;

import java.util.Scanner;

public class MaximamOfTwoNumber {

  
    public static void main(String[] args) {
        System.out.println("plz enter the 1st number");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("enter the second number");
        int b=input.nextInt();
        if(a>b) System.out.println("the max is "+a);
        if(b>a) System.out.println("the max is "+b);
        if(a==b) System.out.println("they are equal");
    }
    
}
