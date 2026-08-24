package arrays;

//Leaders in an Array

// An element is called a leader if it is greater than all elements to its right.
public class leaderElement {
  

  public static void Findleader(int arr[]){
     
    
    for(int i=0;i<arr.length;i++){
      boolean leader=true;
       for(int j=i+1;j<arr.length;j++){
           if(arr[i]<arr[j]){
               leader=false;
               break;
           } 
       }
       if(leader){
        System.out.print(arr[i]+" ");
       }
      } 
  }

  public static void bestcode(int arr[]){
     int maxRight=arr[arr.length-1];
     System.out.print(maxRight);
    for(int i=arr.length-2;i>=0;i--){
       if(arr[i]>maxRight){
          maxRight=arr[i];
           System.out.print(" "+arr[i]);
       }
    }
  }
  public static void main(String[] args) {
      int arr[] = {16,17,4,3,5,2};
      // Findleader(arr); 
      bestcode(arr);
  }
}
