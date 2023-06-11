package inputfromuser;


import java.util.Scanner;

public class assign4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name,roll number,field of interest");
        String name= scanner.next();
        String rollNumber=scanner.next();
        String fieldOfInterest=scanner.next();
        System.out.println("Hey,My name is,"+name+" My roll number is"+rollNumber);
        System.out.println("My field of interest"+fieldOfInterest );



    }
}
