package array;

import java.sql.SQLOutput;

public class LowestPositiveMissingInteger {
    public static void main(String[] args) {

        int arr[] = {2, -3, 2, -4, 1, 8};
        int i = 0;
        while (i < arr.length) {

            int no = arr[i];//2
            if (no > 0 && no < arr.length - 1) {
                int temp = arr[no - 1];//2
                arr[i] = temp;
                arr[no - 1] = no;
            }
            i++;
        }

        for(int j = 0;j< arr.length;j++){
            if(arr[j] != (j+1)){
                System.out.println((j+1));
                break;
            }
        }

    }
}
