package arrays;

public class rotateRightktimes {
    public static void rightRotateKTimes(int arr[], int k) {
      while(k>0){
       int temp=arr[arr.length-1];
      for(int i=arr.length-1;i>0;i--){
           arr[i]=arr[i-1];
      }
         arr[0]=temp;
       k--;
      }
}

    public static void main(String[] args) {
      int arr[] = {10, 20, 30, 40, 50};
      int k = 2;
      rightRotateKTimes(arr, k);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
