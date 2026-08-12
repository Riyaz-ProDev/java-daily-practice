import java.util.Scanner;

public class largest3 {
  public static void main(String[] args) {
    int x,y,z;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x value");
    x=sc.nextInt();
    System.out.println("enter y value");
    y=sc.nextInt();
    System.out.println("enter Z value");
    z=sc.nextInt();

    if(x>=y && x>=z){
      System.out.println("x is largest number");
      }
    else if(y>=z){
      System.out.println("y is largest number");
    } 
    else{
      System.out.println("z is largest number");
    } 
  }
}
