package arrays;

public class Union {

  
  public static void findUnion(int arr1[], int arr2[]) {

    int temp[] = new int[arr1.length + arr2.length];
    int index = 0;

    // Add unique elements from arr1
    for(int i = 0; i<arr1.length;i++) {
        boolean found = false;
        for(int j = 0; j < index; j++) {
            if(arr1[i] == temp[j]) {
                found = true;
                break;
            }
        }
        if(!found) {
            temp[index] = arr1[i];
            index++;
        }
    }

    // Add unique elements from arr2
    for(int i = 0; i < arr2.length; i++) {
        boolean found = false;
        for(int j = 0; j < index; j++) {
            if(arr2[i] == temp[j]) {
                found = true;
                break;
            }
        }
        if(!found) {
            temp[index] = arr2[i];
            index++;
        }
    }
    // Print union
    for(int i = 0; i < index; i++) {
        System.out.print(temp[i] + " ");
    }
}
  public static void main(String[] args) {
   int arr1[] = {1, 2, 3};
    int arr2[] = {3, 4, 5};
    findUnion(arr1, arr2);

  }
}
