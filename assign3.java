package inputfromuser;

import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length and breadth of a rectangle");
        double length=scanner.nextDouble();
        double breadth=scanner.nextDouble();
        System.out.println("area of rectangle="+(int)(length*breadth));


    }
}
