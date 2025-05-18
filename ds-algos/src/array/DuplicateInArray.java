package array;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 2};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1, 2};
        approach1(arr);
        duplicatesApproach2(arr2);

    }

    public static void approach1(int[] arr) {


        Arrays.sort(arr);
        int prev = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1] || arr[i + 1] == prev) {
                prev = arr[i];
                arr[i + 1] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    /*
    You are also given a condition that no element of the array would be
     smaller than 0 and larger than the size of the array. .
     Each element in the array is a valid position in the array also.
Start traversing each element in the array.
For each element, navigate to the position in the array.
If the element is positive, make it negative.
If the element is already negative, it means we were already here,
hence add the element to the list of duplicates.
At the end return the duplicate set.
     */

    public static void duplicatesApproach2(int arr[]) {
        System.out.println();
        //{1, 2, 3, 4, 3, 2, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                System.out.print(index + 1);
            }
            arr[index] = arr[index] * (-1);
        }
    }


}
