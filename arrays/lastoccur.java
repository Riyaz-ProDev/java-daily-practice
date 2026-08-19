package arrays;

public class lastoccur{


  public static int lastOccurrence(int arr[],int target){
    int index=-1;
   for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
           index=i;
        }
      } 
      return index;
   }

  public static void main(String[] args) {
     int arr[]={10,20,30,20,40};
    int target=20;
    int result=lastOccurrence(arr, target);
    System.out.println(result);
  }
  
}
