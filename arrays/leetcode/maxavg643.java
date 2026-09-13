package arrays.leetcode;

public class maxavg643 {
 
  public static double findavg(int nums[],int k){
      int sum=0;
      for(int i=0;i<k;i++){
        sum+=nums[i];
      }
      int maxsum=sum;

      for(int i=k;i<nums.length;i++){
         sum+=nums[i];
         sum-=nums[i-k];
         maxsum=Math.max(sum, maxsum);
      }
      return (double) maxsum/k;
  }

  public static void main(String[] args) {
    
    int nums[]={1,12,-5,-6,50,3};
    int k=4;
    System.out.println(findavg(nums, k));
  }
}
