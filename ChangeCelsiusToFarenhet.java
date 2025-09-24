
package changecelsiustofarenhet;

import java.util.Scanner;

public class ChangeCelsiusToFarenhet {

    public static void main(String[] args) {
        System.out.println("enter the celsius");
        Scanner input=new Scanner(System.in);
        double c=input.nextDouble();
        System.out.println(" it is about "+(9/5d*c+32)+" degree farenhit");
    }
    
}
