package arrays;

public class movingnegbegin {
  
  public static void movenegativeBegining(int arr[]){
       int index=0;
       int temp[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
            temp[index]=arr[i];
            index++;
           }
          }
      for(int i=0;i<arr.length;i++){     
           if(arr[i]>=0){
            temp[index]=arr[i];
            index++;
           }
        }   
        for(int i=0;i<arr.length;i++){
          arr[i]=temp[i];
        }
     }

 public static void movingsnegwithoutarray(int arr[]){
     int index=0;
     int t;
     for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
           t=arr[i];
           for(int j=i;j>index;j--){
               arr[j]=arr[j-1];
           }
           arr[index]=t;
           index++;
        }
     }
 }    
  

  public static void main(String[] args) {
    int arr[] = {1,-2,3,-4,5,-6};
    //movenegativeBegining(arr);
    movingsnegwithoutarray(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
