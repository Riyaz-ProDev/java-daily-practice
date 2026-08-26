package arrays.leetcode;

public class runningsum1480 {
  
  public static void sum(int nums[]){
        
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
     for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
     }

  }
  public static void main(String[] args) {
    int nums[]={1,2,3,4};
    sum(nums);
  }
}
