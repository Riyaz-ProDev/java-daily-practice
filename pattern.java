public class pattern {
  //public static void main(String args[]){
    // int n=4;
    // for(int i=0;i<n;i++){
    //   System.out.println("*");
    // }


    //PRINT RIGHT ANGLE TRAINGLE
    // for(int line=1;line<=4;line++){

    //   for(int star=1;star<=line;star++){
    //     System.out.print("*");
    //   }
    //   System.out.println("");//next line
    // }


    //INVERTED STAR PATTERN
    // for(int line=1;line<=4;line++){
    //   for(int star=4;star>=line;star--){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    //  int n=4;
    // for(int line=1;line<=4;line++){
    //   for(int star=1;star<=n-line+1;star++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    //PRINT HALF-PYRAMID PATTERN
    // for(int line=1;line<=4;line++){
    //   for(int i=1;i<=line;i++){
    //      System.out.print(i);
    //   }
    //   System.out.println();
    // }


    //PRINT CHARACHTER PYRAMIND PATTERN

    // int n=4;
    // char ch='A';
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=i;j++){
    //        System.out.print(ch);
    //        ch++;
    //   }
    //   System.out.println();
    // }




    //HOLLOW RECTANGLE PATTERN
    
    // public static void hollow_rectnagle(int totrows,int totcols){
    //   //outer lopp for rows
    //   for(int i=1;i<=totrows;i++){
    //     //inner loop for columns
    //     for(int j=1;j<=totcols;j++){
    //       if(i==1 ||i==totrows ||j==1 || j==totcols){
    //         System.out.print("*");
    //       }
    //       else{
    //         System.out.print(" ");
    //       } 
    //     } 
    //     System.out.println();
    //   }
     
    // }
    // public static void main(String[] args) {
    //   hollow_rectnagle(4, 5);
    // }

    //inverted half rotated pyramid 

  //   public static void main(String[] args) {
      
  //   int n=7;
  //   //rows
  //  for(int i=1;i<=n;i++){
  //    //spaces =n-i(row)
  //     for(int j=1;j<=n-i;j++){
  //        System.out.print(" ");
  //     }
  //      //for stars
  //      for(int j=1;j<=i;j++){
  //       System.out.print("*");
  //      }
  //        System.out.println();
  //     }
   
  //  }

//INVERTED HALF PYRAMID WITH NUMBERS
//   public static void main(String[] args) {
//     int n=5;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i+1;j++){
//           System.out.print(j);
//       }
//       for(int j=1;j<=n;j++){
//            System.out.print(" ");
//       }
//       System.out.println();
//     }
//   }
// }
  public static void main(String[] args) {

  //   int n=5;
  //   for(int i=1;i<=n;i++){
  //     for(int j=1;j<=n-i+1;j++){
  //         System.out.print(j);
  //     }
  //     for(int j=1;j<=n;j++){
  //          System.out.print(" ");
  //     }
  //     System.out.println();
  //   }
  // }
  // int n=5;
  // int num=1;
  // for(int i=1;i<=n;i++){
  //   for(int j=1;j<=i;j++){
  //     System.out.print(num);
  //     num++;
  //   }
  //   System.out.println();
  // }

  //0-1 traingle
  // int n=5;
  // for(int i=1;i<=n;i++){
  //   for(int j=1;j<=i;j++){
  //     if((i+j)%2==0){
  //       System.out.print("1");
  //     }
  //     else{
  //       System.out.print("0");
  //     }
  //   }
  //   System.out.println();
  // }

  //BUTTERFLY PATTERN
  //  int n=4;

  //  //UPPER HALF
  //   for(int i=1;i<=n;i++){
  //     //LEFT STAR
  //     for(int j=1;j<=i;j++){
  //       System.err.print("*");
  //     }
  //     //spaces
  //     for(int j=1;j<=2*(n-i);j++){
  //       System.out.print(" ");
  //     }
  //     //RIGHT PART
  //     for(int j=1;j<=i;j++){
  //       System.err.print("*");
  //     }
  //     System.err.println();
  //   }
  //  //LOWER PART 
  //  for(int i=n;i>=1;i--){
  //   //LEFT PART
  //   for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   //spaces
  //   for(int j=1;j<=2*(n-i);j++){
  //       System.out.print(" ");
  //     }
  //  for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  //  }

  //SOLID RHOMBUS
  // int n=5;
  // for(int i=1;i<=n;i++){
  //   for(int j=1;j<=(n-i);j++){
  //     System.err.print(" ");
  //   }
  //   for(int j=1;j<=n;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  // }


  // //HOLLOW RHOMBUS
  // int n=5;
  // for(int i=1;i<=n;i++){
  //   int j;
  //   for( j=1;j<=(n-i);j++){
  //      System.out.print(" ");
  //   }
  //   //hollow rectangle 
  //   for(j=1;j<=n;j++){
  //     if(i==n ||i==1 ||j==n|| j==1){
  //    System.out.print("*");
  //   }
  //   else{
  //     System.out.print(" ");
  //   }
  //   }
  //   System.out.println();
  // }

  // int n=7;
  // //UPPER HALF
  // for(int i=1;i<=n;i++){
  //   //for spaces
  //   for(int j=1;j<=(n-i);j++){
  //     System.out.print(" ");
  //   }
  //   //for stars
  //   for(int j=1;j<=(2*i)-1;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  // }
  
 // lower part
  // for(int i=n;i>=1;i--){
  //   //for spaces
  //   for(int j=1;j<=(n-i);j++){
  //     System.out.print(" ");
  //   }
  //   for(int j=1;j<=(2*i)-1;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  // }

  //  //BUTTERFLY PATTERN
  //  int n=7;
  //  //right pat
  //  for(int i=1;i<=n;i++){
  //   for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   //for spaces
  //   for(int j=1;j<=2*(n-i);j++){
  //     System.err.print(" ");

  //   }
  //   //right part 
  //   for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  //  }
  // //lower part
  // for(int i=n;i>=1;i--){
  //   for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   //for spaces
  //   for(int j=1;j<=2*(n-i);j++){
  //     System.out.print(" ");
  //   }
  //   for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   System.err.println();
  // }

  // //1-5 pattern
  // int n=5;
  // for(int i=1;i<=n;i++){
  //   //spaces
  //   for(int j=1;j<=(n-i);j++){
  //     System.out.print(" ");
  //   }
  //   //numbers ->print row no,row no times
  //   for(int j=1;j<=i;j++){
  //     System.out.print(i +" ");
  //   }
  //   System.out.println();
  // }

  //PALINFROMIC PATTERN
  //  int n=5;
  //  for(int i=1;i<=n;i++){
  //   for(int j=1;j<=(n-i);j++){
  //     System.out.print(" ");
  //   }
  //  //first left part  half descending
  //   for(int j=i;j>=1;j--){
  //     System.out.print(j);
  //   }
       //right part ascending
  //   for(int j=2;j<=i;j++){
  //     System.out.print(j);
  //   }
  //   System.out.println();
  //  }

  // int n=5;
  // for(int i=1;i<=n;i++){
  //   for(int j=1;j<=(n-i);j++){
  //     System.out.print(" ");
  //   }
  //   for(int j=1;j<=i;j++){
  //     System.out.print(i+" ");
  //   }
  //   System.out.println();
  // }

  //PALINDROMIC PATTERN WITH NUMBERS

}
} 
