
package amountoftaxinafghanistan;

import java.util.Scanner;

public class AmountOfTaxInAfghanistan {

    public static void main(String[] args) {
        System.out.println("enter the amount of money");
        Scanner input=new Scanner(System.in);
        double totalMoney=input.nextDouble();
        int taxAmount,m1=5000,m2=12500,m3=100000;
        double taxRate;
        double paymentAmount;
         if(totalMoney<5001){
             taxRate=0;
             taxAmount=(int)(totalMoney*taxRate);
             paymentAmount=totalMoney-taxAmount;
    }
         else if(totalMoney<12501){
        taxRate=0.02;
             taxAmount=(int)((totalMoney-m1)*taxRate);
             paymentAmount=totalMoney-taxAmount;
    }
         else if(totalMoney<100000){
        taxRate=0.1;
             taxAmount=(int)((totalMoney-(m1+m2))*taxRate+m2*0.02);
             paymentAmount=totalMoney-taxAmount;
    }
         else {
        taxRate=0.2;
             taxAmount=(int)((totalMoney-(m1+m2+m3))*taxRate+m2*0.02+m3*0.1);
             paymentAmount=totalMoney-taxAmount;
    }
        System.out.println("the total amount is "+totalMoney);
        System.out.println("the tax amount is "+taxAmount);
        System.out.println("the payment amount is "+paymentAmount);
    }
    
}
