package arrays;

public class countGreather{

  public static int Counting(int arr[],int target){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>target){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int arr[] = {10,25,5,40,30,15};
     int target=20;
     System.out.println(Counting(arr, target));
  }
  
}
