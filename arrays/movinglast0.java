package arrays;

public class movinglast0 {

public static void movingZeros(int arr[]){
   int index=0;
   for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
         arr[index]=arr[i];
         index++;
      } 
   }
   for(int j=index;j<arr.length;j++){
         arr[j]=0;
    }
}

  public static void main(String[] args) {
    int arr[] = {10, 0, 30, 0, 50};
    movingZeros(arr);
    for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
    }
  }
}
