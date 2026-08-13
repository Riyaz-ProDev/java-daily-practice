package sorting;
public class merge{
    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = low+(high - low) / 2;
            // first half
            mergeSort(arr,low,mid);
            // second half
            mergeSort(arr,mid + 1,high);
            // merge
            merging(arr,low,mid,high);
        }
    }
    public static void merging(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // compare both halves
        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {        //check first part wrt to second part
                temp[k] = arr[j];
                j++;
            } 
            else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        // remaining left elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // remaining right elements
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp back to arr
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 1, 5, 6, 8, 3};

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}