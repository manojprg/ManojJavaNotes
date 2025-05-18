package array;
/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
 */
public class MergeTwoArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1,2,3,0,0,0 };
        int[] arr2 = { 2,4,5 };
        merge(arr,3,arr2,3);

    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(nums2[j]>nums1[i]){
                nums1[k]=nums2[j];
                j--;
                k--;
            }else{
                nums1[k]=nums1[i];
                i--;
                k--;
            }
        }

        for(int l=0;l<(m+n);l++){
            System.out.println(nums1[l]+" ");
        }
    }
}
