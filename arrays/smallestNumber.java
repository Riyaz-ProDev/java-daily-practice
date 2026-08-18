package arrays;

public class smallestNumber {

  public static int smallNum(int arr[]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<smallest){
        smallest=arr[i];
      }
    }
    return smallest;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    int result=smallNum(arr);
    System.out.println(result);
  }
  
}