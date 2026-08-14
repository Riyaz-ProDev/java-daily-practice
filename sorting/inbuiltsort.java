package sorting;
import java.util.Arrays;
import java.util.Collections;


public class inbuiltsort {
  public static void main(String[] args) {
    int arr1[]={5,4,3,2,1};
    Integer arr2[]={5,4,3,2,1};
    int arr3[]={5,4,3,2,1};

    Arrays.sort(arr1);
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]+" ");
    }
    Arrays.sort(arr2,Collections.reverseOrder());
    for(int i=0;i<arr2.length;i++){
      System.out.println(arr2[i]+" ");
    }
  }
}
