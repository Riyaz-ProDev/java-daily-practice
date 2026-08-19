package arrays;

public class frequency {
  
  public static void frequencyofElement(int arr[]){

    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=0;j<arr.length;j++){
         if(arr[i]==arr[j]){
          count++;
         }
      }
      
      System.out.println(arr[i]+" frequency is "+count);
    }
    
  }

  public static void main(String[] args) {
      int arr[]={1,2,2,3,1,2};
      frequencyofElement(arr);
  }
}
