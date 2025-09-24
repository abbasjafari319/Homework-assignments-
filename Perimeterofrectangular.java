
package perimeterofrectangular;

import java.util.Scanner;

public class Perimeterofrectangular {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the length");
        double length=input.nextDouble();
        System.out.print("enter the width");
        double width=input.nextDouble();
        System.out.println("the perimeter is "+(2*(length+width)));
    }
    
}
