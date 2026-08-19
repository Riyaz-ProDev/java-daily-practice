package arrays;

public class counting {

  public static int countOccurrences(int arr[],int target){
      int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
          count++;
        }
      }
      return count;
  }
  public static void main(String[] args) {
    int arr[]={2,5,2,8,2,9,5};
    int target=5;
    int result=countOccurrences(arr, target);
    System.out.println(result);
  }
}
