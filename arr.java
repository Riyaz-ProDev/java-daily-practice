import java.util.*;
public class arr {
  //SYNTAX
  // datatype arraymane[]=new datatype[size];

  
  //  int numbers[]={1,2,3};
  //  String fruits[]={"apple","banana","orange"};
  // public static void main(String[] args) {
  //   int marks[]=new int[100];
    // Scanner sc=new Scanner(System.in);
    // marks[0]=sc.nextInt();
    // marks[1]=sc.nextInt();
    // marks[2]=sc.nextInt();
    // marks[3]=sc.nextInt();
    // marks[4]=sc.nextInt();
    // System.out.print(marks[0]);
    // System.out.print(marks[1]);
    // // System.out.print(marks[2]);
    // System.out.print(marks[3]);
    // System.out.print(marks[4]);
    // //IN ARRAY UPDATE IS POSSIBLE IT IS MUTABLE DATASTRUCTURE
    // marks[2]=100;
    // System.out.println(marks[2]/100);
    // 

    //TO KNOW THE LENGTH OF ARRAY .length() is used
    // int len=marks.length;
    // System.out.println(len);

// }
// }

// public static int linearSearch(int numbers[],int key){
//   for(int i=0;i<=numbers.length;i++){
//     if(numbers[i]==key){
//       return i;
//     }
//   }
//   return -1;
// }

//LARGEST NUMBER and smallest number in array
// public static int largestNum(int numbers[]){
//    int largest=Integer.MIN_VALUE; //-infinity
//    int smallest=Integer.MAX_VALUE;
//    for(int i=0;i<numbers.length;i++){
//     if(largest<numbers[i]){
//       largest=numbers[i];
//     }
//     if(smallest>numbers[i]){
//       smallest=numbers[i];
//     }
//     }
//     System.out.println("smallest value "+smallest);
//    return largest;
// }


//BINARY SEARCH
// public static int binarySearch(int numbers[],int key){
//   int n=numbers.length;
//   int start=0;
//   int end=n-1;
//   while(start<=end){
//     int mid=(start+end)/2;

//     //COMPARISIONS
//     if(numbers[mid]==key){
//       return mid;
//     }
//     if(numbers[mid]<key){
//          start=mid+1;
//     }
//     // if(numbers[mid]>key){
//     //   int low=mid;
//     // }
//     else{
//        end=mid-1;
//     }
//   }
//   return -1; //no element found
// }

//REVERSE AN ARRAY
// public static void reverseArray(int numbers[]){
//   int n=numbers.length;
//   int first=0;
//   int last=n-1;
//   while(first<last){
//     int temp=numbers[first];
//     numbers[first]=numbers[last];
//     numbers[last]=temp;
//     first++;
//     last--;
//   }
// }


//finding pairs in a an array 
// public static void printPairs(int numbers[]){
//   int totalPairs=0;
//   for(int i=0;i<numbers.length;i++){
//     int curr=numbers[i]; //2,4,6,8,10
//     for(int j=i+1;j<numbers.length;j++){
//        System.out.print("("+curr+","+numbers[j]+")");
//        totalPairs++;
//     }
//      System.out.println();
//   }
//   System.out.println("total pairs is:"+totalPairs);
// }

//PRINTING SUBARRYS  
// public static void subArray(int numbers[]){
//   int totalSubarrays=0;
//   int sum=0;
//   //sub array starts
//   for(int i=0;i<numbers.length;i++){
//     int start=i;
//     //subarray ends
//     for(int j=i;j<numbers.length;j++){
//       int end =j;
//       //print everything from start to end
//        for(int k=start;k<=end;k++ ){
//         System.out.print(numbers[k] +" ");  
       
//        }
//        totalSubarrays++;
//         System.out.println();
       
//     }
//     System.out.println();
   
//   }
//   System.out.println("total subarrays"+totalSubarrays);
   
// }

//SUM OF EACH SUBARRAY
// public static void subArray(int numbers[]) {

//     for (int i = 0; i < numbers.length; i++) {
//         int start = i;

//         for (int j = i; j < numbers.length; j++) {
//             int end = j;
//             int sum = 0;      // Reset sum for every subarray

//             for (int k = start; k <= end; k++) {
//                 System.out.print(numbers[k] + " ");
//                 sum += numbers[k];
//             }

//             System.out.println(" = " + sum);
//         }

//         System.out.println();
//     }
// }

//TO PRINT MAX SUM IN THE SUB ARRAY
// public static void subArray(int numbers[]) {
//     int currSum=0;
//     int maxSum=Integer.MIN_VALUE;
//     for (int i = 0; i < numbers.length; i++) {
//         int start = i;

//         for (int j = i; j < numbers.length; j++) {
//             int end = j;
//             currSum=0;
//                  // Reset sum for every subarray

//             for (int k = start; k <= end; k++) {
//                 System.out.print(numbers[k] + " ");
//                 currSum += numbers[k];
//             }

//             System.out.println(" = " + currSum);
//             if(maxSum<currSum){
//               maxSum=currSum;
//             }

//         }
//     }
//     System.out.println("max sum of subarray "+maxSum);
// }

//finding sum of max sumarray with O(n square) tc
public static void maxSum(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefixArray[]= new int[numbers.length];
    prefixArray[0]=numbers[0];

    for(int i=1;i<prefixArray.length;i++){
        prefixArray[i]=prefixArray[i-1]+numbers[i];
       //printing prefix array System.out.println(prefixArray[i]);
    }

    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            
            
            currSum=start==0?prefixArray[end]:prefixArray[end]-prefixArray[start-1];
        if(maxSum<currSum){
        maxSum=currSum;
    } 
        }
    }
    
    System.out.println("the max sum sub array "+maxSum);
   
}

public static void main(String[] args) {
  

//LINER SEARCH IN ARRAY key=10
//  int numbers[]={2,4,6,8,10,12,14,16};
//  int key=10;
//  int index=linearSearch(numbers, key);
//      if(index==-1){
//       System.out.println(key+" is not found");
//      }
//      else{
//       System.out.println("key at index "+index);
//      }


//FIND LARGEST NUMBER IN ARRAY
//in java 
// -infinity is "integer.MIN_VALUE"
// +infinity is "integer.MAX_VALUE"
//  int numbers[]={1,2,6,3,5,100};
//  System.out.println("the largest num "+largestNum(numbers));
 
//BINARY SEARCH
// int numbers[]={2,4,6,8,10,12,14};
// int key=10;
// int result=binarySearch(numbers, key);
// System.out.println("the index of key value "+key+" is "+result);
 
//REVERSE AN ARRAY
// int numbers[]={2,4,6,8,10};
// reverseArray(numbers);
// for(int i=0;i<numbers.length;i++){
//   System.out.print(numbers[i]+" ");
// }


//finding pairs in a an array 

  //  int numbers[]={2,4,6,8,10};
  //  printPairs(numbers);

//PRINTING SUBARRYS   

    // int numbers[]={2,4,6,8,10};
    // subArray(numbers);

    //TO PRINT MAX SUM IN THE SUB ARRAY
    // int numbers[]={2,4,6};
    // subArray(numbers);

    //with O(n square) TC
     int numbers[]={2,4,6};
     maxSum(numbers);

 System.out.println("hello world");
    }

}
