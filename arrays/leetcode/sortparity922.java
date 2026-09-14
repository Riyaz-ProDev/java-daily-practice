package arrays.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortparity922{
  
  public static int[] arrange(int arr[]){
     int eindex=0;
     int oindex=1;
     int temp[]=new int[arr.length];
     for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
         temp[eindex]=arr[i];
         eindex+=2;
      }
      else{
        temp[oindex]=arr[i];
        oindex+=2;
      }
     }
    return temp;
  }
  public static void main(String[] args) {
    int arr[]={4,2,5,7};
    System.out.println(Arrays.toString(arrange(arr)));
  }
}
