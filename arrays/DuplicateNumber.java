package arrays;

public class DuplicateNumber {
  public static int duplicate(int arr[]){
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                return arr[j];
              }
         }
     }
     return 0;
  }
  
  
  
  public static void main(String[] args) {
    int arr[] = {1, 3, 4, 2, 3};
    int result=duplicate(arr);
    System.out.println(result);

  }
}
