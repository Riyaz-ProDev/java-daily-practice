package arrays;

public class Equilibriumindex {

    public static void findEqulibrium(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int firstSum = 0;
            int secondSum = 0;
            // calculate left sum
            for(int j = 0; j<i;j++) {
                firstSum += arr[j];
            }
            // calculate right sum
            for(int j=i+1;j<arr.length;j++) {
                secondSum+=arr[j];
            }

            // compare
            if(firstSum==secondSum) {
                System.out.println("equilibrium index " + i);
                System.out.println("equilibrium element " + arr[i]);
                return;
            }
        }

        System.out.println("No equilibrium index found");
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};

        findEqulibrium(arr);
    }
}