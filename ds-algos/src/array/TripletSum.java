package array;

import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {5, 32, 1, 7, 10, 50, 19, 21, 2};
        Arrays.sort(arr);
        int target = 58;

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int k = arr.length - 1;
            while (j < k) {
                int num = arr[i] + arr[j] + arr[k];
                if (num < target) {
                    j++;
                } else if (num > target) {
                    k--;
                } else {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    break;
                }
            }
        }
    }

}
