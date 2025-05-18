package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is a leader if it is greater than or equal to all the elements
to its right side. The rightmost element is always a leader.

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
 */
public class LeadersInArray {

    //Function to find the leaders in the array.
    static List<Integer> leaders(int arr[], int n) {
        //iterate from end and arr[i] > max are leaders
        List<Integer> list = new ArrayList<Integer>();
        int max = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 16,17,4,3,5,2};
        System.out.println(leaders(arr,6));
    }
}
