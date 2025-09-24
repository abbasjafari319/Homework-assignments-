
package mounthlyinterest;

import java.util.Scanner;

public class MounthlyInterest {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("enter the anual rate");
        double annualRate= input.nextDouble();
        double monthlyRate= annualRate/1200;
        System.out.println("enter the loan amount");
        double loanAmount= input.nextDouble();
        System.out.println("enter the number of the years");
        int year=input.nextInt();
        double a=1/(Math.pow(1+monthlyRate,12*year));
        double monthlyPayment=monthlyRate*loanAmount/(1-a);
        double totalPayment=monthlyPayment*12*year;
        System.out.println("monthly payment is"+monthlyPayment);
        System.out.println("total payment is"+totalPayment);
        
     
    }
    
}