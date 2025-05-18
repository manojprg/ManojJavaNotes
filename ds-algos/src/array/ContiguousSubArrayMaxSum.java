package array;

public class ContiguousSubArrayMaxSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = Integer.MIN_VALUE, sum = 0;
/*
To find the maximum sum of a subarray, especially when negative numbers are present,
Kadane's Algorithm is used. If the sum of two consecutive elements becomes more negative
and is less than the current element, we reset the sum to the current element, effectively
ignoring the previous sum.
 */
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            if (sum < arr[i]) {
                sum = arr[i];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }

        }

        System.out.println("Maximum sum = " + sum);
    }

}
