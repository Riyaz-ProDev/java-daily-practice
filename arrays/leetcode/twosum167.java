package arrays.leetcode;

import java.util.*;
public class twosum167 {
  
  public static int[] findTwo(int nums[],int target){
       int left=0;
       int right=nums.length-1;
       while(left<right){
         int sum=nums[left]+nums[right];
         if(sum==target){
          return new int[]{left+1,right+1};
         }
         else if(sum>target){
             right--;
         }
         else{
          left++;
         }
       }
        return new int[]{};
  }
  public static void main(String[] args) {
    int nums[]={2,7,11,15};
    int target=9;
    int[] result=findTwo(nums, target);
    System.out.println(Arrays.toString(result));


  }
}
