package arrays;

public class RemoveDuplicates26 {
  
public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

  public static void main(String[] args) {
     int nums[]={1, 1, 2, 2, 3};
     int k=3;
     System.out.println(removeDuplicates(nums));
  }
}
