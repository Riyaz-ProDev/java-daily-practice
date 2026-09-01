package arrays.leetcode;

import java.util.Arrays;

public class dublicarezero1089 {

    public static int[] find(int arr[]) {

        int temp[] = new int[arr.length];
        int index = 0;

        for(int i = 0; i < arr.length && index < temp.length; i++) {

            if(arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
            else {
                temp[index] = 0;
                index++;

                if(index < temp.length) {
                    temp[index] = 0;
                    index++;
                }
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        int arr[] = {1,0,2,3,0,4,5,0};

        System.out.println(Arrays.toString(find(arr)));
    }
}