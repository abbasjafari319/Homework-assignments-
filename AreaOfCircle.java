
package areaofcircle;


public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("plz enter the radius");
        double radius= input.nextDouble();
        if(radius>=0)
        System.out.println("the area is "+(Math.PI*radius*radius));
    }
    
}

