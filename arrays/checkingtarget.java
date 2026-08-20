package arrays;

public class checkingtarget {

public static boolean contains(int arr[], int target) {
    for(int i=0;i<arr.length;i++){
       if(arr[i]==target){
        return true;
       }
    }
    return false;
}

  public static void main(String[] args) {
     int arr[] = {10, 20, 30, 40, 50};
      int target = 30;
      System.out.println(contains(arr, target));
    
  }
}
