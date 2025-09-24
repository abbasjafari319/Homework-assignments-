
package reversenumber;

import java.util.Scanner;

public class Reversenumber {

   
    public static void main(String[] args) {
        System.out.println("plz enter a 3 digut number to reverse it");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=a%10;
        int c=(a/10)%10;
        int d=(a/100);
        System.out.println("the reverse is "+b+c+d);
    }
    
}
