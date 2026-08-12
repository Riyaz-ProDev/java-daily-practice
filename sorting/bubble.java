package sorting;
public class bubble {
  public static void bubblesort(int arr[]){
     for(int turns=0;turns<arr.length-1;turns++){
      for(int i=0;i<arr.length-1-turns;i++){
        if(arr[i]>arr[i+1]){
          //swap
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
     }
  }
  public static void main(String[] args) {
    int arr[]={2,1,5,6,3,7};
    bubblesort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    }
  }
  
}
