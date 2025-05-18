package array;
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.
Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElementsInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1,2,3,2,7,2 };
        removeElement(arr,2);
        int[] arr2 = { 1,1,2,2,3,4 };
        removeDuplicates(arr2);

    }
    static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
    static int removeDuplicates(int[] nums) {

        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[count]){
                count++;
                nums[count]=nums[i];

            }

        }
        return count+1;
    }
}
