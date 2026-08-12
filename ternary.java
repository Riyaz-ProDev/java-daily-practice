import java.util.Scanner;

public class ternary {
  public static void main(String[] args) {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
     n=sc.nextInt();
     String checknum=(n%2==0)? "n is even":"n is odd";
     System.out.println(checknum);
  }
}
