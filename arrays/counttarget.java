package arrays;

public class counttarget {
   public static int counting(int arr[],int target){
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
          count++;
        }
     }
     return count;
   }

  public static void main(String[] args) {
     int arr[]={4,2,7,2,9,2,5};
     int target=2;
     int result=counting(arr, target);
     System.out.println(result);

  }
}
