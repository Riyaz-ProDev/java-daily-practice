package arrays;

class sum{
 public static int sumArray(int arr[]){
  int sum=0;
  for(int i=0;i<arr.length;i++){
      sum+=arr[i];
  }
  return sum;
 }
public static int sumHalf(int arr[]) {
  int sum1=0;
    for(int i=0;i<(arr.length+1)/2;i++){
       sum1+=arr[i];
    }
    return sum1;
}
  public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int result=sumArray(arr);
    System.out.println(result);
    int result1=sumHalf(arr);
    System.out.println(result1);
  }
}