package arrays;

public class secondsmall {
  public static int secondsmal(int arr[]){
    int firstsmallest=Integer.MAX_VALUE;
    int secondsmallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<firstsmallest){
        secondsmallest=firstsmallest;
        firstsmallest=arr[i];
      }
      else if(arr[i]<secondsmallest){
        secondsmallest=arr[i];
      }
    }
    return secondsmallest;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int result=secondsmal(arr);
    System.out.println(result);
  }
}
