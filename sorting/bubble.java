package sorting;
public class bubble {
  // public static void bubblesort(int arr[]){
  //    for(int turns=0;turns<arr.length-1;turns++){
  //     for(int i=0;i<arr.length-1-turns;i++){
  //       if(arr[i]>arr[i+1]){
  //         //swap
  //         int temp=arr[i];
  //         arr[i]=arr[i+1];
  //         arr[i+1]=temp;
  //       }
  //     }
  //    }
  // }

  public static void selectionSort(int arr[]){
      
      int temp;
      for(int i=0;i<arr.length-1;i++){
         int minPos=i;
           for(int j=i+1;j<arr.length;j++){
              if(arr[minPos]>arr[j]){
                minPos=j;
              }
           }
           temp=arr[minPos];
           arr[minPos]=arr[i];
           arr[i]=temp;
      }

  }
  public static void main(String[] args) {
    int arr[]={2,1,5,6,3,7};
  //   bubblesort(arr);
  //   for(int i=0;i<arr.length;i++){
  //     System.out.print(arr[i]);
  //   }
     selectionSort(arr);
     for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    }

  }
  
}
