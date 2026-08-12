import java.util.Scanner;

public class calc {
  public static void main(String[] args) {
    int a,b;
    char operator;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    a=sc.nextInt();
    System.out.println("enter b value");
    b=sc.nextInt();
    System.out.println("enter the operator");
    operator=sc.next().charAt(0);
    switch(operator){
      case '+':{
        System.out.println(a+b);
        break;
      }
      case '-':{
        System.out.println(a-b);
        break;
      }
      case '*':{
        System.out.println(a*b);
        break;
      }
      case '/':{
        System.out.println(a/b);
        break;
      }
      case '%':{
        System.out.println(a%b);
        break;
      }
      default:{
        System.out.println("Invalid operator");
      }
    }
    }
}
