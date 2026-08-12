public class basics {
  // public static Boolean isPalindrome(int n){
  //   int original=n;
  //    int p=0;
  //    while (n>0) {
  //     int lastDigit=n%10;
  //     p=p*10+lastDigit;
  //     n=n/10;
  //    }
  //    return p==original;
  // }

  // Happy Number ⭐⭐

    // public static void happyNumber(int n) {

    //     int temp = n;
    //     while (temp != 1 && temp != 4) {
    //         int total = 0;
    //         while (temp > 0) {
    //             int lastDigit = temp % 10;
    //             int num = lastDigit * lastDigit;
    //             total += num;
    //             temp = temp / 10;
    //         }
    //         temp = total;
    //     }
    //     if (temp == 1) {
    //         System.out.println("Happy Number");
    //     } else {
    //         System.out.println("Not a Happy Number");
    //     }
    // }
  //STRONG NUMBER
    // public static boolean isStrongNumber(int n){
    //     int original=n;
    //     int total=0;
      
    //     while(n>0){
    //       int lastDigit=n%10;
    //       int fact=1;
    //       for(int i=1;i<=lastDigit;i++){
    //          fact*=i;
    //        }  
    //          n=n/10;
    //       total+=fact;
    //     }
    //     return total==original;
    // }

    //Spy Number

// public static boolean isSpyNumber(int n){
//    int sum=0;
//    int product=1;
//    while(n>0){
//      int lastDigit=n%10;
//      sum+=lastDigit;
//      product*=lastDigit;
//      n=n/10;
//    }
//    return sum==product;
// }   

// //DISARIUM NUMBER
// public static int countNumber(int n){
//   int count=0;
//   int temp=n;
//   while(temp>0){
//      temp=temp/10;
//      count++;
//   }
//   return count;
// }

// public static Boolean isDisariumNumber(int n){
//   int original=n;
//   int total=0;
//   int count=countNumber(n);
//   while(n>0){
//     int power=1;
//     int lastDigit=n%10;
//     for(int i=1;i<=count;i++){
//       power*=lastDigit;
//     }
//     count--;
//     n=n/10;
//     total+=power;
//   }
//   return total==original;
// }

//perfect square
// public static boolean isPerfectSquare(int n){
   
//    for(int i=1;i<=n;i++){
//       if(i*i==n){
//         return true;
//       }
//    }
//    return false;
// }
//sunny number relation perfect square


//SUNNY NUMBER
// A number is called a Sunny Number if n + 1 is a perfect square.
// public static boolean isSunnyNumber(int n){
//     int original=n;
//     for(int i=1;i*i<n;i++){
//        if(i*i==n+1){
//         return true;
//        }
//     }
//     return false;
// }
// Strong Number Peterson Number Krishnamurthy Number
// public static boolean isPetersonNumber(int n){
//    int original=n+1;
//    int sum=0:
//    while(n>0){
//     int fact=1;
//     int lastDigit=n%10;
//     for(int i=1;i<=lastDigit;i++){
//       fact*=i;
//     }
//     n=n/10;
//     sum+=fact;
//    }
//    return sum==original;
// }

//MAGIC NUMBER
// public static boolean isMagicnumber(int n){
//   int original=n;
//   int sum=0;
//   while(n>9 &&n!=1){
//     sum=0;
//   while(n>0){
//     int lastDigit=n%10;
//     sum+=lastDigit;
//     n=n/10;
//    }
//   n=sum;
//  }
//  return n==1;
// }

// //tech number
// A number is a Tech Number if:

// It has an even number of digits.
// Split it into two equal halves.
// Add the two halves.
// Square the sum.
// If it equals the original number → Tech Number.

// public static int countNumber(int n){
//    int count=0;
//    while(n>0){
//       n=n/10;
//       count++;
//    }
//    return count;
// }
//for four digits
// public static boolean isTechnumber(int n){
//       int original=n;
//       int count=countNumber(n);
//       if(count%2==0){
//           int lasttwoDigit=n%100;
//           int firsttwoDigit=n/100;
//           int sum=lasttwoDigit+firsttwoDigit;
//           int square=sum*sum;
//         return square==original;
//       }
//       else{
//         return false;
//       }    
// }   
// for 6 digits of tech number
// 
//KAPREKAR NUMBER is opposite of tech number
// A number is a Kaprekar Number if:

// Find its square.
// Split the square into two parts.
// Add the two parts.
// If the sum equals the original number, it is a Kaprekar Number.

// public static int countNumber(int n){
//     if(n == 0){
//         return 1;
//     }
//     int count = 0;
//     while(n > 0){
//         count++;
//         n /= 10;
//     }
//     return count;
// }

// public static boolean isKaprekarNumber(int n){

//     if(n == 1){
//         return true;
//     }

//     int square = n * n;
//     int divisor = 1;

//     int digits = countNumber(n);

//     for(int i = 0; i < digits; i++){
//         divisor *= 10;
//     }

//     int left = square / divisor;
//     int right = square % divisor;

//     return (left + right) == n;
// }

//prime and reverse for emirp number
// An Emirp Number is a number that satisfies all three conditions:

// ✅ The number itself is Prime.
// ✅ Reverse the number.
// ✅ The reversed number is also Prime.
// ❌ The reversed number should not be the same as the original.

// public static boolean isPrime(int n){
    
//      if(n<=1){
//         return false;
//      }
//      for(int i=2;i*i<=n;i++){
//         if(n%i==0){
//             return false;
//         }
//      }
//      return true;
// }

// public static int reverseNumber(int n){
//        int reverse=0;
//        while(n>0){
//         int lastDigit=n%10;
//         reverse=reverse*10+lastDigit;
//         n=n/10; 
//        }
//     return reverse;
// }

// public static boolean isEmirpnumber(int n){
    
//      if(!isPrime(n)){
//         return false;
//      }
//      int reverse=reverseNumber(n);
//      if(reverse==n){
//         return false;
//      }
//    return isPrime(reverse);
// }

//circular prime

// Circular Prime is a number where:

// The number is prime.
// Every rotation of its digits is also prime.
// 197 =197,971,719 is also prime then ciricular prime
 
// public static boolean isCircularPrime(int n){
//     int temp=n;
//     if(!isPrime(n)){
//         return false;
//     }

    // int digits = 0;
    // while(temp>0){
    //     temp=n/10;
    //     digits++;
//     }

//     int divisor = 1;
//     for(int i = 1; i < digits; i++){
//         divisor *= 10;
//     }

//     int rotation = n;

//     for(int i = 0; i < digits - 1; i++){

//         int lastDigit = rotation % 10;
//         int remaining = rotation / 10;

//         rotation = lastDigit * divisor + remaining;

//         if(!isPrime(rotation)){
//             return false;
//         }
//     }
//     return true;
// }

// Keith Number

// A Keith Number is a number that appears in a sequence generated from its own digits.

// public static boolean isKeithnumber(int n){
//     int original=n;
//     int temp=n;
//     int digits=0;
   
//     while(temp>0){
//       temp=temp/10;
//       digits++;
//    }
//    int arr[]=new int[digits];
//    for(int i=digits-1;i>=0;i--){
//        int lastDigit=n%10;
//          arr[i]=lastDigit;
//          n=n/10;
//    }
   
//    while(true){
//    int next=0;
//    for(int i=0;i<arr.length;i++){
//        next+=arr[i];
//    }
//    if(next==original){
//     return true;
//    }
//    if(next>original){
//     return false;
//    }
//    for(int i=0;i<arr.length-1;i++){
//      arr[i]=arr[i+1];
     
//    }
//    arr[arr.length-1]=next;
// }
// }

// Automorphic Number

// A number is called Automorphic if its square ends with the same number.

// Example 1
// 5² = 25

// Ends with 5 ✅

// public static boolean isAutomorphic(int n){
//     int original=n;
//      int square=n*n;

//      int digits=0;
//      while(n>0){
//         n=n/10;
//         digits++;
//      }
//     int divisor=1;
//    for(int i=0;i<digits;i++){
//       divisor*=10;
//    }
//      int lastDigit=square%divisor;
//      if(lastDigit==original){
//         return true;
//      }
//      return false;
// }
    
//ARMSTRONG NUMNER
// public static boolean isArmstrongNumber(int n){
//     int original = n;
//     int digits = countNumber(n);
//     int total = 0;
//     while(n > 0){
//         int lastDigit = n % 10;
//         int power = 1;
//         for(int i = 1; i <= digits; i++){
//             power*=lastDigit;
//         }
//         total += power;
//         n = n / 10;
//     }
//     return total == original;
// }

// ⭐ Neon Number.
// A number is Neon if the sum of digits of its square equals the original number.
// 9² = 81 ,8 + 1 = 9

// public static boolean isNeonnumber(int n){
//   int original=n;
//   int square=n*n;
//   int sum=0;
//  while(square>0){
//    int lastDigit=square%10;
//    sum+=lastDigit;
//    square=square/10;
//  }
//  return sum==original;
// }

// Duck Number
// A Duck Number contains at least one 0, but the number should not start with 0.

// public static boolean isDucknumber(int n){
//   while(n>=1){
//     int lastDigit=n%10;
//     if(lastDigit==0){
//       return true;
//     }
//     n=n/10;
//   }
//   return false;
// }

// Harshad Number (Niven Number)
// A number is Harshad if it is divisible by the sum of its digits.  
// 18 → 1 + 8 = 9
// 18 % 9 = 0 ✅
//  public static boolean isharshadNumber(int n){
//    int original=n;
//    int sum=0;
//    while(n>0){
//      int lastDigit=n%10;
//      sum+=lastDigit;
//      n=n/10;
//    }
//    return original%sum==0;
//  }

// Abundant Number
// A number is Abundant when the sum of its proper divisors is greater than the number.
// 12
// Divisors: 1, 2, 3, 4, 6
// 1 + 2 + 3 + 4 + 6 = 16
// 16 > 12 ✅

// public static boolean isAbundantnumber(int n){
//   int divisorsum=1;
//   for(int i=1;i<=n/2;i++){
//     ;
//     if(n%i==0){
//       divisorsum+=i;
//     }
//   }
//   return divisorsum>n;
// }

// Next: Deficient Number  X abundant number
// A number is Deficient when the sum of its proper divisors is less than the number.

// public static boolean isDeficientnumber(int n){
//   int sum=0;
//   for(int i=1;i<=n/2;i++){
//     if(n%i==0){
//      sum+=i;
//     }
//   }
//   return sum<n;
// }

// GCD is the largest number that divides two given numbers without leaving any remainder.(HCF)
// GCD = Greatest Common Divisor GCF = Greatest Common Factor HCF = Highest Common Factor are same

// public static int findGcd(int a,int b){
//   int gcd=1;
//   for(int i=1;i<=Math.min(a,b);i++){
//     if(a%i==0 && b%i==0){
//       gcd=i;
//     }
//   }
//   return gcd;
// }


//optimal solution for gcd via eculind number(better approach with simp;e)
 
public static int findGcd1(int a,int b){

  while(b!=0){
  int remainder=a%b;  
  a=b;
  b=remainder;
  }
  return a;
}

//LCM(least common facor)
// LCM is the smallest positive number that is a multiple of both given numbers.
// ex:-
// Multiples of 12 → 12, 24, 36, 48, 60, ...
// Multiples of 18 → 18, 36, 54, 72, ...
// First common multiple = 36
// formula:-LCM × GCD = a × b then lcm=a*b/gcd

// public static int findLcm(int a ,int b){
//      int gcd=findGcd1(a, b);
//      int lcm=a*b/gcd;
//      return lcm;
// }

// find lcm without gcd help
// public static int findLcmwithoutgcd(int a,int b){
//   int max=Math.max(a,b);  
//   while(true){
//     if(max%a==0 && max%b==0){
//       return max;
//     }
//     max++;
//     }
// }

//fibinoci sequnece

// public static void fibonaci(int n){
//   int first=0;
//   int second=1;
//   for(int i=0;i<n;i++){
//      System.out.print(first+" ");
//      int next=first+second;
//      first=second;
//      second=next;
//   }
// }

//factorial
// public static void findFactorial(int n){
//    int fact=1;
//    for(int i=1;i<=n;i++){
//     fact*=i;
//    }
//    System.out.println(fact);
// }

//Power of a Number
// public static int powerofNumber(int n,int power){
//     int result=1;
//     for(int i=1;i<=power;i++){
//        result*=n;
//     }
//      return result;
// }

// //swapping of 2 numbers values
// public static void swapNumbers(int a,int b){
//      int temp=a;
//          a=b;
//          b=temp;
//     System.out.println("a="+a+" b="+b);
// }

//without temp
// public static void swapNumberswithouttemp(int a,int b){
//    a=a+b;
//    b=a-b;
//    a=a-b;
//    System.out.println("a="+a+" b="+b);
// }

public static void swapusingXor(int a,int b){
  a=a^b;
  b=a^b;
  a=a^b;
  System.out.println("a="+a+" b="+b);
}



  public static void main(String[] args) {
    // int n=136631;
    // Boolean result=isPalindrome(n);
    // System.out.println(result);

    // Happy Number ⭐⭐⭐
    // happyNumber(19);

    //STRONG NUMBER (the sum of each digit factotial i =s equal to original numner ex:-145)
    // System.out.println(isStrongNumber(145));

//  Spy Number
// System.out.println(isSpyNumber(123));

//DIASRIUM NUMBER
// System.out.println(isDisariumNumber(135));

//perfect square
// System.out.println(isPerfectSquare(2));
//SUNNY NUMBER
// A number is called a Sunny Number if n + 1 is a perfect square.
// System.out.println(isPetersonNumber(145));
//MAGIC NUMBER
// System.out.println(isMagicnumber(19));

//Tech number
// System.out.println(isTechnumber(494209));//2025

//kaprekar number
// System.out.println(isKaprekarNumber(45));

//circular prime number
// System.out.println(isCircularPrime(197));

//keith number
// System.out.println(isKeithnumber(14));

//nenon number
// System.out.println(isNeonnumber(9));

//duck number
// System.out.println(isDucknumber(1201));
// System.out.println(isDucknumber(121));

//abdundant number(sum>n)
// System.out.println(isAbundantnumber(12));
// System.out.println(isAbundantnumber(2));

//defient number(sum<n)
// System.out.println(isDeficientnumber(12));
// System.out.println(isDeficientnumber(2));

//GCD
// System.out.println(findGcd(12, 18));
// System.out.println(findGcd1(12, 18));

// System.out.println(findLcm(12, 18));//with gcd
// System.out.println(findLcmwithoutgcd(12, 18));//without gcd

//fibonaci sequence
// fibonaci(7);

//factorial
// findFactorial(4);

//power of number
// int result=powerofNumber(3, 3);
// System.out.println(result);
//swap 2 numbers
// swapNumbers(20, 25);
// swapNumberswithouttemp(20, 25);
// swapusingXor(20, 30);









   


  }
}
