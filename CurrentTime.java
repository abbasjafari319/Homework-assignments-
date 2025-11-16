package currenttime;
public class CurrentTime  { 
    public static void main(String[] args)  { 
        long millis = System.currentTimeMillis(); 
        long second = (millis / 1000) % 60 ; 
        long minute = (millis / (1000 * 60)) % 60 ; 
        long hour = (millis / (1000 * 60 * 60)) % 24 ; 
        System.out.println("Current time (GMT): " + hour + ":" + minute + ":" + second) ; 
     } 
} 