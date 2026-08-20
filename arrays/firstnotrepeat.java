package arrays;

public class firstnotrepeat{

    public static int firstNonRepeating(int arr[]) {
    for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
      
          }
          return arr[i];
       }
    }
    return -1;
}

  public static void main(String[] args) {
    
    int arr[] = {4, 5, 1, 2, 1, 4};
    int result=firstNonRepeating(arr);
    System.out.println(result);
  }
  
}
