package arrays;

public class dublicatesremove {
  public static void removeDuplicates(int arr[]) {
       System.out.print(arr[0] + " ");
     for(int i=1;i<arr.length;i++){
         if(arr[i]!=arr[i-1]){
          System.out.print(arr[i]+" ");
         }
         
     }
}
public static int removeDublicatesbyindex(int arr[]){
  int index=1;
  for(int i=1;i<arr.length;i++){
      if(arr[i]!=arr[i-1]){
         arr[index]=arr[i];
         index++;
      }
  }
  return index;
}

  public static void main(String[] args) {
    int arr[] = {1, 1, 2, 2, 3, 4, 4};
    //removeDuplicates(arr);
    int uniqueCount=removeDublicatesbyindex(arr);
    System.out.println("unique elements:");

    for(int i=0;i<uniqueCount;i++){
      System.out.print(arr[i]+" ");
    }
     System.out.print("\nunique count:"+uniqueCount);

  }
}
