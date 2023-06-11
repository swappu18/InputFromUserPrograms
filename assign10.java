package inputfromuser;

import java.util.Scanner;

public class assign10 {
    public static void main(String[] args) {
        System.out.println("enter marks of three subjects");
        Scanner scanner=new Scanner(System.in);
        int sub1=scanner.nextInt();
        int sub2=scanner.nextInt();
        int sub3=scanner.nextInt();
        int total=sub1+sub2+sub3;
        System.out.println("total marks=" +(total));
        System.out.println("total percentage="+(total*100)/300f);


    }

    }

