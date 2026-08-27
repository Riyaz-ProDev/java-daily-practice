package arrays;

import java.util.Scanner;


public class arrays2d {

  public static void findLargest(int matrix[][]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix.length;j++){
           if(max<matrix[i][j]){
              max=matrix[i][j];
           }
      }
    }
    System.out.println(max);
  }
  
  public static boolean findKey(int matrix[][],int key){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
        if(matrix[i][j]==key){
          System.out.println("the key is found i="+i+" j="+j);
          return true;
        }
      }
    }
    System.out.println("key is not found");
    return false;
  }
  public static void main(String[] args) {
      int matrix[][]=new int[3][3];
      int n=3;
      int m=3;

      Scanner sc=new Scanner(System.in);
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          matrix[i][j]=sc.nextInt();
        }
      }

      //printing
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println("");
      }
      // int key=5;
      // System.out.println(findKey(matrix, key));
      findLargest(matrix);

  }
}
