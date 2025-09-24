
package computbmi;

import java.util.Scanner;

public class ComputBMI {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your wieght in kg");
        double wieght=input.nextDouble();
        System.out.println("enter the height in meter");
        double height= input.nextDouble();
        double ibm= wieght/(height*height);
        if(ibm<18.5) System.out.println("your are underwieght.");
        else if(ibm<25)  System.out.println("you are normal.");
        else if(ibm<30)    System.out.println("you are overwieght.");
        else System.out.println("you are abese.");
    }
    
}
