
package sumofnaturalnumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("enter the natural number");
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("the sum of "+n+" natural number is " + (n*++n/2));
    }
    
}
