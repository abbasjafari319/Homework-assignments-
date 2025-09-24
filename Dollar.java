
package dollar;

import java.util.Scanner;

public class Dollar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the amount in dollar");
        double amount=input.nextDouble();
        int dollar= (int)(amount/1);
        int cent= (int)((amount*100)%100);
        int quarter= (cent/25);
        int dimes=(cent%25)/10;
        int nickle=((cent%25)%10)/5;
        int pennie=(((cent%25)%10%5));
        System.out.println("it is "+dollar+" dollar \n"+quarter+" quarter \n"+dimes+" dimes \n"+nickle+ " nickles \n"
             +pennie+" pennies \n "
                     );
    }
    
}
