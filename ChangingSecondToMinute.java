
package changing.second.to.minute;

import java.util.Scanner;

/**
 *
 * @author AJ
 */
public class ChangingSecondToMinute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("enter the total seconds");
        int totalSecond=input.nextInt();
        int min=totalSecond/60;
        int sec=totalSecond%60;
        System.out.println("the total minute is "+min);
        System.out.println("and the second is "+sec);
    }
    
}
