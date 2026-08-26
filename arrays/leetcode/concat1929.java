package arrays.leetcode;

public class concat1929 {
  
  public static void concatArray(int arr[]){
      int ans[]=new int[arr.length*2];
      int index=0;
      int last=arr.length;
      for(int i=0;i<arr.length;i++){
           ans[index]=arr[i];
           ans[last]=arr[i];
           index++;
           last++;
      }
      for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");
   }

  }
  public static void main(String[] args) {
   int arr[]={1,2,1};
   concatArray(arr);
     
  }
}



// class Solution {
//     public int[] getConcatenation(int[] arr) {
//         int ans[]=new int[arr.length*2];
//         for(int i=0;i<arr.length;i++){
//             ans[i]=arr[i];
//             ans[i+arr.length]=arr[i];
//         }
//       return ans;
//     }
// }