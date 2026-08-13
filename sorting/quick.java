package sorting;

public class quick {

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = arr[low];
            int i = low + 1;
            int j = high;
            while (i <= j) {
                while (i <= high && arr[i] <= pivot) {
                    i++;
                }
                while (j >= low && arr[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;

            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 4};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
