import java.util.Scanner;

public class javabasics{
  public static void main(String[] args) {
    // System.out.println("Welcome DSA");
    // int a=10;
    // int b=5;
    // System.out.println(a+b);
    // Scanner sc = new Scanner(System.in);
    // // String input=sc.next();
    // // System.out.println(input);
    // System.out.println("enter your full name");
    // String name=sc.nextLine();
    // System.out.println("your name is"+name);

    //PROUDCT OF   2 NUMBERS
    // int a,b;
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter A value");
    // a=sc.nextInt();
    // System.out.println("Enter B value");
    // b=sc.nextInt();
    // System.out.println("product of A and B is "+a*b);

    //AREA OF CIRCLE
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of circle");
    float r=sc.nextFloat();
    float area=3.14f* r * r ;
    System.out.println(area);
}
}