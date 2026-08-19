package arrays;

public class posnegcount {

  public static void counting(int arr[]){
     int positive=0;
     int negative=0;
     int zero=0;
    
    for(int i=0;i<arr.length;i++){
       if(arr[i]==0){
        zero++;
       }
       else if(arr[i]<0){
        negative++;
       }
       else{
        positive++;
       }
     }
     System.out.println("posivitive = "+positive);
     System.out.println("negative = "+negative);
     System.out.println("zero = "+zero);
  }

  public static void main(String[] args) {
    
    int arr[] = {-2,5,-7,8,3,-1,0};
    counting(arr);
  }
}
