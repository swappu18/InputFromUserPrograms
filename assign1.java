package inputfromuser;//take two values from user and then addition and product.


import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        System.out.println("enter two values");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();


        System.out.println("sum is="+(num1+num2));
        System.out.println("product is="+(num1*num2));

    }
}
