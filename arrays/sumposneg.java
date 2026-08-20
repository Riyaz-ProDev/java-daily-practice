package arrays;

public class sumposneg {
  
  public static void countingElements(int arr[]){
    int positivesum=0;
    int negativesum=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
          positivesum+=arr[i];
        }
        else if(arr[i]<0){
          negativesum+=arr[i];
        }
    }
    System.out.println("positive sum "+positivesum);
    System.out.println("negative sum "+negativesum);

  }

  public static void main(String[] args) {
    
    int arr[] = {-2,5,-7,8,3,-1,0};
    countingElements(arr);
  }
}
