package arrays;

public class Intersection{

public static void findIntersection(int arr1[],int arr2[]){
    boolean common=false;
    for(int i=0;i<arr1.length;i++){
      for(int j=0;j<arr2.length;j++){
          if(arr1[i]==arr2[j]){
          System.out.print(arr1[i]+" "); 
          common=true;
          }
      }
    }
    if(common==false){
      System.out.println("No coomon elements");
    }
}

  public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 4, 5};
    int arr2[] = {3, 4, 5, 6, 7};
    findIntersection(arr1, arr2);
  }
  
}
