
package random.lottery;

import java.util.Scanner;

public class RandomLottery {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("this program will choose you for the lottery if you enter the right number");
        System.out.println("please enter a number that have only two digit");
        int guessNumber=input.nextInt();
        int lotteryNumber=(int)(Math.random()*100);
        int lotteryFirstDigit= lotteryNumber/10;
        int lotterySecondDigit=lotteryNumber%10;
        int guessFirstDigit=guessNumber/10;
        int guessSecondDigit=guessNumber%10;
        if(lotteryNumber==guessNumber) 
            System.out.println("you enter the right number and you win 10000$");
        else if(lotteryFirstDigit==guessSecondDigit && lotterySecondDigit==guessFirstDigit)
            System.out.println("you win 3000$");
        else if(lotteryFirstDigit==guessFirstDigit
                || lotteryFirstDigit== guessSecondDigit
                || lotterySecondDigit==guessFirstDigit
                || lotterySecondDigit==guessSecondDigit)
            System.out.println("you win 1000$");
        else System.out.println("so sorry, there is no match");
        
        
    }
    
}
