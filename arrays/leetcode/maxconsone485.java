package arrays.leetcode;
public class maxconsone485 {
  

  public static int findMax(int nums[]){
    int maxCount=0;
    int count=0;
    for(int right=0;right<nums.length;right++){
       if(nums[right]!=0){
          count++;
       }
       else{
        count=0;
       }  
       maxCount=Math.max(maxCount, count);
    }
    return  maxCount;
  }
  public static void main(String[] args) {
    int nums[]={1,1,0,1,1,1};
  System.out.println(findMax(nums));
  }
}
