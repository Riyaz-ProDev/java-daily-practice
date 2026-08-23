package arrays;

public class sumevenodd {
   
public static void addNums(int arr[]){
   int evenSum=0;
   int oddSum=0;
   for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
          evenSum+=arr[i];
        }
         else{
          oddSum+=arr[i];
         }
   }
    System.out.println("even sum "+evenSum);
    System.out.println("odd sum "+oddSum);
}


  public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      addNums(arr);
  }
}
