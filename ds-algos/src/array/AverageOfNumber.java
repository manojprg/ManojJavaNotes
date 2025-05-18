package array;

public class AverageOfNumber {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50,50};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sum = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min || arr[i] == max) {
                j++;
                continue;
            }
            sum = sum + arr[i];
        }
        int avg = sum / (arr.length - j);
        System.out.println("avg " + avg);
    }
}
