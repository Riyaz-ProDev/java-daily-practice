package arrays.leetcode;

public class richestcus1672 {
  
  public static int findRich(int accounts[][]){
     int rich=0;
     for(int i=0;i<accounts.length;i++){
      int sum=0;
      for(int j=0;j<accounts[i].length;j++){
           sum+=accounts[i][j];
      }
      rich=Math.max(rich, sum);
     }
     return rich;
  }
  public static void main(String[] args) {
    int[][] accounts = {
    {1, 2, 3},
    {3, 2, 1},
    {5,5,5}
};
  System.out.println(findRich(accounts));
  }
}
