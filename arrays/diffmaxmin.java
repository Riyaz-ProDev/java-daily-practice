package arrays;

public class diffmaxmin {

  public static int differenceMaxiumminimun(int arr[]){
     
     int big=Integer.MIN_VALUE;
     int small=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
        if(arr[i]<small){
           small=arr[i];
        }
        if(arr[i]>big){
          big=arr[i];
        }
     }
     int difference=big-small;
    return difference;
  }
  public static void main(String[] args) {
     int arr[] = {10, 5, 20, 8, 15};
     int result=differenceMaxiumminimun(arr);
     System.out.println(result);
  }
  
}
