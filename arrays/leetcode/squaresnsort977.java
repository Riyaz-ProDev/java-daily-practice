package arrays.leetcode;

public class squaresnsort977 {
  public static int[] findSquare(int nums[]){
      int left=0;
      int right=nums.length-1;
      int index=nums.length-1;
      int ans[] = new int[nums.length];
      while(left<=right){
        int lsquare=nums[left]*nums[left];
        int rsquare=nums[right]*nums[right];
        if(lsquare>rsquare){
             ans[index]=lsquare;
             left++;
        }
        else{
          ans[index]=rsquare;
          right--;
        }
        index--;
      }
      return ans;

  }
  public static void main(String[] args){
    int nums[]={-4,-1,0,3,10};
    int[] result=findSquare(nums);
    for(int i=0;i<nums.length;i++){
      System.out.print(result[i]+" ");
    }
  }
}
