package arrays;
import java.util.*;
public class twosum{

public static int[] summing(int arr[],int target){
     for(int j=0;j<arr.length;j++){
     for(int i=j+1;i<arr.length;i++){
        if(arr[i]+arr[j]==target){
            return new int[] {j,i};
        }       
      }   
    }  
     return new int[]{-1,-1};
}

  public static void main(String[] args) {
    int arr[]={2,7,11,15};
    int target=9;
    int[] result=summing(arr, target);
    System.out.println(Arrays.toString(result));

  }
  
}
