import java.util.Scanner;

public class condition {
  public static void main(String[] args) {
   //1)if-else
    // int a=10;
    // int b=20;
    // if(a>b){
    //   System.out.println("A is greather than b");

    // }
    // else{
    //   System.out.println("B is greather than A");
    // }


  //EVEN OR ODD NUMBER
  // Scanner sc=new Scanner(System.in);
  // System.out.println("enter the number to check even or odd");
  // int n=sc.nextInt();
  // if(n%2==0){
  //   System.out.println(n+ "is even number");
  // }
  // else{
  //   System.out.println(n+ "is odd number");
  // }
  
  
  //INCOME TAX CALCULATOR
  int income;
  int tax;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the income to calculate Tax");
   income=sc.nextInt();
   if(income<500000){
      tax=0;
      System.out.println(tax +" is paid for tax");
   }
   else if(income>500000 &&income<1000000)
   {
    tax=(int)(income*0.2);
     System.out.println(tax +" is paid for tax");
   }
   else{
    tax=(int)(income*0.3);
    System.out.println(tax +" is paid for tax");
   }
  }
}
