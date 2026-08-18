package arrays;

public class countOdd{
  public static int Counting(int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
       count++;
      }
    }
     return count;
  }
  public static void main(String[] args) {
    int arr[]={2,1,30,40,50};
    int result=Counting(arr);
    System.out.println(result);
  }

}