package sorting;
public class bubble{

public static void bubbleSort(int arr[]){
  for(int turn=0;turn<arr.length-1;turn++){
    int swapCount=0;
    for(int i=0;i<arr.length-1-turn;i++){
       if(arr[i]>arr[i+1]){
         int temp=arr[i];
         arr[i]=arr[i+1];
         arr[i+1]=temp;
         swapCount++;
       }
    }
    if(swapCount==0){
       break;  
    }
       
  }
}

   public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    bubbleSort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
   }
}