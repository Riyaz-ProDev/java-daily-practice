import java.util.*;
public class func {
  /*syntax
   returnType name(){
    //body
   return statement
    }
  */

// public static void printHelloworld(){
//   System.out.println("functions started");
// }

// public static void CalculateSum(){
//   Scanner sc =new Scanner(System.in);
//     int a =sc.nextInt();
//     int b=sc.nextInt();
//     int sum=a+b;
//     System.out.println(sum);
// }

//PROUCT OF 2 NUMBERS
// public static int mul(int a ,int b){
//     int  product=a*b;
//     return product;
// }

//FACTORIAL OF A NUMBER
public static int factorial(int n){
   int f=1;
  for(int i=1;i<=n; i++){
      f=f*i;
  } 
  return f;   
  }

//BINOMIAL COEFICINET
 
// N         N!/
//  C   =     R!(N-R)!
//   R

// public static int binCoe(int n,int r){
//      int n_fact=factorial(n);
//     int r_fact=factorial(r);
//     int n_r_fact=factorial(n-r);
//     int bcoef=n_fact/(r_fact * n_r_fact);
//     return bcoef;
     
// }

//FUNCTION OVERLOADING
 //DIFFERNENT FUNCTIONS ARE CREATED WITH SAME NAME and it is diffenrted by datatype of parameters and no.of parameters in each function

// public static int sum(int a ,int b){
//   return a+b;
// }
// public static int sum(int a ,int b,int c){
//   return a+b+c;
// }
// public static float sum(float a,float  b){
//   return a+b;
// } 


//PRIME NUBMER
// public static boolean isPrime(int n){
//    if(n==2){
//    return true;
//    }
//   boolean isPrime=true;
//   for(int i=2;i<=n-1;i++){
//     if(n%i==0){
//       isPrime=false;
//     }
//   }
//   return isPrime;
// }


// //PRINT ALL PRIME NUMBERS IN A RANGE
// public static void primesInRange(int n){
//      for(int i=2;i<=n;i++){
//        if(isPrime(i)){
//         System.out.print(i+" ");
//        }
//      }
// }

//CONVERTING BINARY TO DECIMAL

// public static void bintodec(int binnum){
//   int pow=0;
//   int decNum=0;
//   int Mynum=binnum;

//   while(binnum>0){
//     int lastDigit=binnum%10;
//     decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
//     pow++;
//     binnum=binnum/10;
//   }
//   System.out.println("decimal of "+Mynum+" ="+decNum);
// }

//CONVERING DECIMAL TO BINARY


// public static void dectoBin(int n){
//   int pow=0;
//   int binNum=0;
//   int mynum=binNum;

//   while(n>0){
//     int rem=n%2;
//     binNum=binNum+(rem*(int)Math.pow(10,pow));
//     pow++;
//     n=n/2;
//   }
//    System.out.println(binNum);
// }
 public static void main(String[] args) {
      // printHelloworld();
      //  CalculateSum();
      // int pro=   mul(3, 5);
      // System.out.println(pro);
    //  int fact= factorial(4);
    //  System.out.println(fact);
      //  int r= binCoe(5,2);
      //  System.out.println(r);
      
      // int two=sum(5,5);
      // int three=sum(5,5,5);
      // float poin=sum(2.5f,3.5f);
      // System.out.println(two);
      // System.out.println(three);
      // System.out.println(poin);
        // System.out.println(isPrime(10));
      // primesInRange(10);
      //  bintodec(101);
      //  dectoBin(5);
 } 
}
