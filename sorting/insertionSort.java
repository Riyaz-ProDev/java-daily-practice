// package sorting;

// public class insertion {

// public static void insertionSort(int arr[]){
  
//   for(int i=1;i<arr.length;i++){
//       int current=arr[i];
//       int j=i-1;
//       while(j>=0 && arr[j]>current){
//          arr[j+1]=arr[j];
//          j--;
//       }
//      arr[j+1]=current;
//   }
// }  

//   public static void main(String[] args) {
//     int arr[]={2,4,1,5,6,2};
//     insertionSort(arr);
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]);
//     }
//   }
// }

package sorting;
import java.util.Arrays;
public class insertionSort{

  public static void insertion(int arr[]){
   for(int i=1;i<arr.length;i++){
     int current=arr[i];
     int prev=i-1;
     while(prev>=0 && arr[prev]>current){
        arr[prev+1]=arr[prev];
        prev--;
     }
     arr[prev+1]=current;
   }
  }

  public static void main(String[] args) {
    int arr[]={5,4,3,2,1};
    int arr1[]={5,4,3,2,1};
    Arrays.sort(arr1);
    insertion(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    }
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]);
    }
  }
}
