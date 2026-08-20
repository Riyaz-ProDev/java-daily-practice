package arrays;

public class largerstSecond{
public static int secondLargest(int arr[]){
    int firstlargest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
         if(arr[i]>firstlargest){
          secondlargest=firstlargest;
          firstlargest=arr[i];
         }
        else if(arr[i]>secondlargest){
            secondlargest=arr[i];
         }
    }
    return secondlargest;
}

  public static void main(String[] args) {
    int arr[] = {10,25,5,40,30,15};
    int result=secondLargest(arr);
    System.out.println(result);
  }
  
}
