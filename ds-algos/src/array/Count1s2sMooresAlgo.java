package array;

/*
count should be greater than n/2 where n is total no. of elements
 */
public class Count1s2sMooresAlgo {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 2}; //ans-2
        int i = 0;
        int count = 0;
        int candidate = arr[i];
        while (i < arr.length) {

            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i + 1];
            }
            i++;
        }
        System.out.println("candiadte "+ candidate);
    }
}
