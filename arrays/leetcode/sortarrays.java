package arrays.leetcode;

import java.util.Arrays;

public class sortarrays {
  

  public static int[] sorting(int nums[]){
      int index=0;
      int[] temp=new int[nums.length];

      int last=nums.length-1;
      for(int i=0;i<nums.length;i++){
         if(nums[i]%2==0){
            temp[index]=nums[i];
            index++;
         }
         else{
            temp[last]=nums[i];
            last--;
         }
      }
     return temp;
  }
  public static void main(String[] args) {
     int nums[]={2,7,11,6};
     int[] result=sorting(nums);
     System.out.println(Arrays.toString(result));
     System.out.println(Arrays.toString(sorting(result)));
  }
}

