package arrays;

public class secondLarge {

  public static int secondLarge(int arr[]){
     int firstLargest=Integer.MIN_VALUE;
     int secondLarget=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
          if(arr[i]>firstLargest){
            secondLarget=firstLargest;
            firstLargest=arr[i];
          }
          else if(arr[i]>secondLarget){
            secondLarget=arr[i];
          }
     }
     return secondLarget;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int result=secondLarge(arr);
    System.out.println(result);
  }
}
