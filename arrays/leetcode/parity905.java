package arrays.leetcode;
//package

import java.lang.reflect.Array;
import java.util.Arrays;

public class parity905 {
  
 public static void sort(int nums[]) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
/
        if (nums[left]%2==0) {
            left++;
        }
        else if(nums[right] % 2 != 0) {
            right--;
        }
        else {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }
}
  public static void main(String[] args) {
    int nums[]={3,1,2,4};
    sort(nums);
    System.out.println(Arrays.toString(nums));
  }
}
