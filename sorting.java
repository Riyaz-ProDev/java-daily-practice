public class sorting {
  
  //BUBBLE SORT
  // public static void bubbleSort(int arr[]){
  //  for(int turn=0;turn<arr.length-1;turn++){
  //   for(int i=0;i<arr.length-1-turn;i++){
  //     if(arr[i]>arr[i+1]){
  //       int temp=arr[i];
  //       arr[i]=arr[i+1];
  //       arr[i+1]=temp;
  //     }
  //   }
  //  }
  // }
  // public static void printArray(int arr[]){
  //   for(int i=0;i<arr.length;i++){
  //     System.out.print(arr[i]+" ");
  //   }
  //   System.out.println();
    
  // }


  //SELECTION SORT
public static void selectionSort(int arr[]) {

    for (int turn = 0; turn < arr.length - 1; turn++) {

        // Assume the current position has the smallest element
        int minimumIndex = turn;

        // Find the smallest element in the remaining array
        for (int j = turn + 1; j < arr.length; j++) {

            if (arr[j] < arr[minimumIndex]) {
                minimumIndex = j;
            }
        }

        // Swap the smallest element with the current position
        int temp = arr[turn];
        arr[turn] = arr[minimumIndex];
        arr[minimumIndex] = temp;
    }
}
 public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    
  }

  public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    // bubbleSort(arr);
    // printArray(arr);

    selectionSort(arr);
    printArray(arr);
    
    
    
  }
}
