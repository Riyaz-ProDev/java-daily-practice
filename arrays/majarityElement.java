package arrays;

public class majarityElement {

  public static int findMajarity(int arr[]){
     int n=arr.length;
     int majarity=n/2;
     for(int i=0;i<arr.length;i++){
      int appear=0;
       for(int j=0;j<arr.length;j++){
         if(arr[i]==arr[j]){
              appear++;
         }
     }
     if(appear>majarity){
           return arr[i];
        }
    }
     return -1;
  }
  public static void main(String[] args) {
    
     int arr[] = {2, 2, 1, 2, 3, 2, 2};
     System.out.println(findMajarity(arr));
  }
  
}
