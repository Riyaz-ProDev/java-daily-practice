/**
 * binary
 */
//BINARY SEARCH
public class binary {
      // public static int binarySearch(int nums[],int key){
      //    int low=0;
      //  int high=nums.length-1;
      //  while(low<=high){
      //   int mid=low+(high-low)/2;
      //      if(nums[mid]==key){
      //       return mid;
      //      }
      //         if(nums[mid]<key){
      //           low=mid+1;
      //         }
      //         else{
      //           high=mid-1;
      //         }
      //      }
      //      return -1;//not find key
      // }

 //LINEAR SEARCH     
//  public static int linearSearch(int nums[],int key){
    
//     for(int i=0;i<=nums.length-1;i++){
//       if(key==nums[i]){
//          return i;
//       } 
//     }
//     return -1;
//   }

//Largest element
// public static int largestNum(int nums[]){
//   int largest=Integer.MIN_VALUE;
//   for(int i=0;i<nums.length;i++){
//     if(largest<nums[i]){
//        largest=nums[i];
//     }
//   }
//   return largest;
// }

//reverseArray
// public static void reverseArray(int nums[]){
//   int first=0;
//   int last=nums.length-1;
//   while(first<last){
//    int temp=nums[first];
//    nums[first]=nums[last];
//    nums[last]=temp;
//     first++;
//     last--;
//   }
// }

//secondLargest in array
// public static int secondLargest(int nums[]) {
//     int firstlargest = Integer.MIN_VALUE;
//     int secondlargest = Integer.MIN_VALUE;

//   for(int i=0;i<nums.length-1;i++){
//     if(firstlargest<nums[i]){
//        secondlargest=firstlargest;
//        firstlargest=nums[i];
//     }
//     else if(secondlargest<nums[i] && firstlargest!=nums[i]){
//       secondlargest=nums[i];
//     }
//   }  
//   return secondlargest;  
// }


//SMALLEST ELEMENT IN ARRAY 

// public static int smallestElement(int nums[]){
//   int smallest=Integer.MAX_VALUE;
//   for(int i=0;i<nums.length;i++){
//       if(smallest>nums[i]){
//         smallest=nums[i];
//       }
//   }
//   return smallest;
// }


//Check if an Array is Sorted

// public static Boolean checkArraySorting(int nums[]){
// for(int i=0;i<nums.length-1;i++){
//    if(nums[i]>nums[i+1]){
//      return false;
//    }
// }
// return true;
// }

//Move All Zeros to the End

// public static void moveZero(int nums[]){
//   int first=nums[0];
//   int last=nums[nums.length-1];
//     for(int i=0;i<nums.length;i++){
//         if(nums[i]==0){
//           last=nums[i];
//         }
//         else{
//           first=nums[i];
//         }
//         first++;
//         last--;
//     }
  
// }


// Left Rotate Array by One

// public static void leftRotateByOne(int nums[]) {
// int temp=nums[0];
// for(int i=0;i<nums.length-1;i++){
//       nums[i]=nums[i+1];
// }
// nums[nums.length-1]=temp;
// }

// Left Rotate Array by K Positions
// public static void leftRotateByK(int nums[], int k) {
//     for(int i=0;i<k;i++){
//       int temp=nums[0];
//       for(int j=0;j<nums.length-1;j++){
//         nums[j]=nums[j+1];
//       }
//       nums[nums.length-1]=temp; 
//     }
// }

//Frequency of an Element
// public static int countOfElement(int nums[],int key){
//     int count=0;
//     for(int i=0;i<nums.length;i++){
//       if(nums[i]==key){
//         count+=1;
//       }
//     }
//     return count;
// }

//SUM OF ALL ELEMENTS
// public static int sumOfArray(int nums[]) {
//     int sum=0;
//     for(int i=0;i<nums.length;i++){
//       sum+=nums[i];
//     }
//     return sum;
// }

// //AVERAGE OF ARRAY
// public static int averageOfArray(int nums[]){
//      int sum=0;
//      int totalNumbers=0;
//      int avg;
//      for(int i=0;i<nums.length;i++){
//         sum+=nums[i];
//         totalNumbers+=1;
//      }
//      avg=sum/totalNumbers;
//      return avg;
// }

//DIFFERENCE OF AN ARRAY OF MAX AND MIN ELEMENTS
// public static int difference(int nums[]) {
//     int min=Integer.MAX_VALUE;//+infi
//     int max=Integer.MIN_VALUE;//-infi
//     for(int i=0;i<nums.length;i++){
//        if(max<nums[i]){
//         max=nums[i];
//        }
//        if(min>nums[i]){
//         min=nums[i];
//        }
//     }
//     int diff=max-min;
//     return diff;
// }


//FINDING MISSING NUMBER IN SORTED ARRAY(1-n) only
// public static int missingNumber(int nums[]){
//   int exceptedSum=0;
  
//   int lastElmenet=nums.length+1;
//   int n=lastElmenet;
//    int ActualSum=(n*(n+1))/2;
//    for(int i=0;i<nums.length;i++){
//     exceptedSum+=nums[i];
//    }
//    int diff=ActualSum-exceptedSum;
//    return diff;
// }

//FINDING MISSING NUMBER IN SORTED ARRAY(n-n) random sorted number

// public static int randomMissedNumber(int nums[]) {

//     for (int i = 0; i < nums.length - 1; i++) {

//         int difference = nums[i + 1] - nums[i];

//         if (difference > 1) {
//             return nums[i] + 1;
//         }
//     }
//     return -1;
// }

// Remove Duplicates from a Sorted Array

// public static int removeDublicateNumbers(int nums[]){
//     int i=0;
//     for(int j=1;j<nums.length;j++){
//        if(nums[i] != nums[j]){
//               i++;
//           nums[i] = nums[j];
//         } 
//     }
//     return i+1;
// }


//MOVING 0S TO END THE ARRAY
// public static void moveZeros(int nums[]) {
//     int i = 0;
//     for (int j = 0; j < nums.length; j++) {
//         if (nums[j] != 0) {
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++;
//         }
//     }
// }

//PRIME NUMBER

// public static boolean isPrime(int n){
 
//     for(int i=2;i<n;i++){
//       if(n <= 1){
//         return false;
//     }
//       if(n%i==0){
//         return false;
//       }
//     }
//     return true;
// }

//ARMSTRONG NUMBER
// public static int armstrongNumber(int n){
//    int original=n;
//    int sum=0;
//    while(n>0){
//       int lastDigit=n%10;
//       sum+=lastDigit*lastDigit*lastDigit;
//       n=n/10;
//    }
//    return sum;
// }

//POLYNOMIAL OF A NUMBERR
// public static boolean isPalindrome(int n){
//       int temp=n;
//       int reverse=0;
//       while(n>0){
//         int lastDigit=n%10;
//         reverse=reverse*10+lastDigit;
//         n=n/10;
//       }
//       return reverse==temp;
// }

//POLYNOMIAL OF A STRING

// public static boolean isPalindrome(String str){
//   int left=0;
//   int right=str.length()-1;
//   while(left<right){
//     if(str.charAt(left)!=str.charAt(right)){
//          return false;
//     }
//     right--;
//     left++;
//     }
//      return true;
// }

// //Reverse a String
// public static void reverseString(String str){
//   int left=0;
//   int right=str.length()-1;
//   char arr[] = str.toCharArray();
//   while(left<right){
//   char temp=arr[left];
//   arr[left]=arr[right];
//   arr[right]=temp;
//    left++;
//    right--;
//   }
//   System.out.println(arr);
// }

//COUNT VOWELS IN A STRING
// public static int countVowels(String str){
//   str = str.toLowerCase();
//   int count=0;
//   char arr[]=str.toCharArray();
//   for(int i=0;i<arr.length;i++){
//        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
//          count+=1;
//        }
//   }
//   return count;
// }


// // Count Consonants in a string
// public static int countConsonants(String str){
//      int count=0;
//      str=str.toLowerCase();
//      for(int i=0;i<str.length();i++){
//       char ch=str.charAt(i);
//       if(ch>='a'&&ch<='z'){
//       if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
//          count+=1;
//       }
//      }
//     }
//      return count;
// }



// //Count Words in a Sentence
// public static int countWords(String str){
//    int count=0;
//    if(str.length() == 0){
//          return 0;
//        }
//    for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//       if(ch ==' '){
//         count++;
//       }
//    }
//    return count+1;
// }

// Reverse a Number
// public static int reverseNumber(int n){
//     int reverse=0;
//      while(n>0){
//        int lastDigit=n%10;
//        reverse=reverse*10+lastDigit;
//        n=n/10;
//      }
//      return reverse;
// }

// // Count numerial Digits in a String
// public static int countNumericalDigits(String str){
//   int count=0;
//   for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//     if(ch>='0' && ch<='9'){
//        count+=1;
//     }
//   }
//   return count;
// }

public static void main(String[] args) {
//     int nums[]={1,2,3,4,5,6};
//     int key=8;
//     int result=binarySearch(nums, key);
//     if (result != -1) {
//     System.out.println("Element found at index: " + result);
// } else {
//     System.out.println("Element not found");
// }

//LINEAR SEARCH

  //  int nums[]={2,6,4,8,7,5,3};
  //  int key=4;
  //  int result=linearSearch(nums, key);
  //  System.out.println("Element found at index: " + result);

  //Largest element
    // int nums[]={2,6,4,8,7,5,3};
    // int result=largestNum(nums);
    // System.out.println(result);

    //reverseArray
    // int nums[]={2,6,4,8,7,5,3};

    // //secondLargest in array
    //  int nums[]={2,6,4,8,7,5,3};
    //  int result=secondLargest(nums);
    //  System.out.println(result);

// //SMALLEST ELEMENT IN ARRAY    
//      int nums[]={6,4,8,7,5,3};
//      int result=smallestElement(nums);
//      System.out.println(result);

// //Check if an Array is Sorted
//    int nums[]={1,2,3,4,5,6};
//    Boolean result=checkArraySorting(nums);
//    System.out.println(result);

//Move All Zeros to the End
    // int nums[]={1,0,3,0,5,6};
    
    
    
    // // Left Rotate Array by One
    // int nums[]={1,2,3,4,5,6};
    // leftRotateByOne(nums);

    // for(int i=0;i<nums.length;i++){
    //   System.out.print(nums[i]);
    // }

// Left Rotate Array by K Positions
    // int nums[]={1,2,3,4,5,6};
    // leftRotateByK(nums, 2);

    // for(int i=0;i<nums.length;i++){
    //   System.out.print(nums[i]);
    // }


//Frequency of an Element    
  //   int nums[]={1,2,3,2,5,2};
  //  int key=2;
  //  int result=countOfElement(nums, key);
  //  System.out.println(result);

// //SUM OF ARRAYS
//  int nums[]={1,2,3,2,5,2};
//    int result=sumOfArray(nums);
//    System.out.println(result);

// //AVERAGE OF ARRAY
//  int nums[]={1,2,3,2,5,5};
//  int result=averageOfArray(nums);
//  System.out.println(result);

//DIFFERENCE OF AN ARRAY OF MAX AND MIN ELEMENTS
    // int nums[]={1,2,3,2,5,2};
    // int result=difference(nums);
    // System.out.println(result);


//FINDING MISSING NUMBER IN SORTED ARRAY
    //  int nums[]={1,2,4,5,6};
    // int result=missingNumber(nums) ;
    // System.out.println(result);

//FINDING MISSING NUMBER IN SORTED ARRAY(n-n) random sorted number
    // int nums[]={21,22,24,25,26};
    // int result=randomMissedNumber(nums);
    // System.out.println(result);

//Remove Duplicates from a Sorted Array    
  //  int nums[]={1,1,2,2,3,4,5};
  //  int result=removeDublicateNumbers(nums);
  //  System.out.println(result);//for number of unique elements
  //  for(int i=0;i<result;i++){
  //   System.out.print(nums[i]);
  //  }

  //MOVING 0S TO END THE ARRAY
  // int nums[]={1,0,4,0,6,7,8};
  // System.out.println(isPrime(5));

//  int result=armstrongNumber(111);
//  System.out.println(result);

// //nested-loop program yourself.
// int n=5;
// for(int i=0;i<n;i++){
//   for(int j=0;j<=i;j++){
//     System.out.print("*");
// }
// System.out.println();
// }

//PALINDROME OF A NUMBER
    //  System.out.println(isPalindrome(121));

//PALINDROME OF A STRING
// System.out.println(isPalindrome("rar"));

// //Reverse a String
// reverseString("riyaz");

//COUNT NUMBER OF VOWELS IN A STRING
// int result=countVowels("riyaz");
// System.out.println(result);

//COUNT WORDS IN A STRING
// int result=countWords("sri indu college");
// System.out.println(result);

// // Count Consonants in a string
// int result=countConsonants("riyaz");
// System.out.println(result);

// Count Digits in a String
// int result=countNumericalDigits("riyaz7864");
// System.out.println(result);

// Reverse a Number
// int result=reverseNumber(12345);
// System.out.println(result);

}
}