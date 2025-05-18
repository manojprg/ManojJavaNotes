package array;

import java.util.Arrays;

/*
Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.
Example 1:

Input: n = 6
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
 */
public class MinimumNoOfPlateformNeeded {

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Minimum no of plateform needed : " + findPlatform(arr, dep, 6));
    }

    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        //first sort both the array, after sorting
        //        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        //        int dep[] = {910, 1120, 1130, 1200, 1900, 2000};
        //      i will point to arr and j will point dep , each train time is an event
        // if arr time is less than dep, it means we need a plateform so that it will increment i and currentPlateformNeeded
        // if dep time is less than arr currentPlateformNeeded will be decremented and j++ 
        int minNoOfPlateform = 0, currentPlateformNeeded = 0;

        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                currentPlateformNeeded++;
                i++;
            }
            else {
                j++;
                currentPlateformNeeded--;
            }
            if (minNoOfPlateform < currentPlateformNeeded) {
                minNoOfPlateform = currentPlateformNeeded;
            }
        }
        return minNoOfPlateform;

    }
}
