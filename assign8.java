package inputfromuser;

import java.util.Scanner;

public class assign8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        boolean AllAreEqual=num1==num2 &&num1==num3;
        boolean OnlyTwoAreEqual=(num1==num2) || (num1==num3);

        System.out.println("all numbers are equal="+ (AllAreEqual));
        System.out.println("only two are equal="+ (OnlyTwoAreEqual));

    }
}
