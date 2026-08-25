package arrays;

public class pairsum{

  public static void findPairSum(int arr[],int target){
    for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
         if(arr[i]+arr[j]==target){
            System.out.println("pair "+ arr[i]+" "+arr[j]);
         }
       }
    }
  }
public static void optimizedCode(int arr[],int target){
     int first=0;
     int last=arr.length-1;
     while(first<last){
        if(arr[first]+arr[last]==target){
           System.out.println("pair "+arr[first]+" "+arr[last]);
           break;
        }
           else if(arr[first]+arr[last]>target){
            last--;
           }
           else{
            first++;
           }
        }      
  }


  public static void main(String[] args) {
    int arr[] = {2, 4, 7, 11, 15};
     int target = 9;
     findPairSum(arr,target);
    optimizedCode(arr, target);
    
  
}
}