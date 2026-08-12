public class conversion {
  //S-B   /automatic conversion //BYTE->SHORT->INT->LONG->FLOAT->DOUBLE
  //1)WIDENING/IMPLICIT CONVERSION
//   public static void main(String[] args) {
//     int a=10;
//     long b=a;
//     System.out.println(b);//possible
//   }
// }

//2)NARROW OR EXPLICIT CONVERSION big -small
public static void main(String[] args) {
  float a=10.33f;
 // int b=a;//NOT possinle
 int b =(int)a;//possible
  System.out.println(b);
}
}