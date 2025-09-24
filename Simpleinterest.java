
package simpleinterest;

import java.util.Scanner;

public class Simpleinterest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the amount of loan");
        double loan= input.nextDouble();
        System.out.println("enter the number of years");
        int year=input.nextInt();
        System.out.println("enter the rate");
        double rate= input.nextDouble();
        System.out.println("the simple interest is "+(loan*year*rate/100));
    }
    
}
