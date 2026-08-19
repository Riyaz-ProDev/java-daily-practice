package arrays;

//missing number in sequence
//missing number=expectedsum-actual sum

public class missingNumber {
  public static int missing(int arr[]){
    int actualSum=0;
    int n=arr.length+1;
    int expectedSum=(n*(n+1))/2;
    for(int i=0;i<arr.length;i++){
       actualSum+=arr[i];
    }
    int missingNum=expectedSum-actualSum;
   return missingNum;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,5,6};
    int result=missing(arr);
    System.out.println(result);
    
  }
}
