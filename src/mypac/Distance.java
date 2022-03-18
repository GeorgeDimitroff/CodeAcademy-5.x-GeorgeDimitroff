package mypac;

import static java.lang.Math.sqrt;

/*
Напишете програма Distance, която изчислява разстоянието от точка (x,y) до (0,0) по формулата:
result = sqrt(x^2 + y^2)
 */

public class Distance {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        double result = sqrt(x*x + y*y);
        //double result = sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance from (" + x + ", " + y + ") to (0,0) is equal to " + result);
    }
}
