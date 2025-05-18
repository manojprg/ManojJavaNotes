package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SumOfPair {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {2, 7, 11, 5, 5, 5, 3, 7, 3, 7};
        int target = 10;
        pairs(arr, target);
        findPairsUsing2Pointer(arr, target);
        findUniquePairsUsingMap(arr, target);
        findPairsUsing2PointerUnique(arr, target);
    }

    private static void pairs(int arr[], int target) {

        Map<Integer, Integer> map = new HashMap<>();
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {

                int diff = target - arr[i];
                if (map.containsKey(diff)) {
                    System.out.println(arr[i] + "," + diff);
                }
                map.put(arr[i], i);
            }
        } else {
            System.out.println("There must be at least to elements to find the pair");
        }
    }

    static void findPairsUsing2Pointer(int arr[], int target) {
        System.out.println("findPairsUsing2Pointer");
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            int num = arr[left] + arr[right];
            if (num < target) {
                left++;
            } else if (num > target) {
                right--;
            } else {
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            }

        }
    }

    static void findPairsUsing2PointerUnique(int arr[], int target) {
        System.out.println("findPairsUsing2PointerUnique");
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            //This logic will keep only unique pair
            if ((left - 1) == 0 || left == (left - 1)) {
                left++;
                continue;
            }
            int num = arr[left] + arr[right];
            if (num < target) {
                left++;
            } else if (num > target) {
                right--;
            } else {
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            }

        }
    }


    static void findUniquePairsUsingMap(int arr[], int target) {
        System.out.println("unique pairs using map");
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {

            if (key.getValue() > 1 && (2 * key.getKey()) == target) {
                System.out.println(key.getKey() + "," + key.getKey());
                map.remove(key.getKey());
            }
            int diff = target - key.getKey();
            if (map.containsKey(diff)) {
                System.out.println(diff + "," + key.getKey());
                map.remove(key.getKey());
            }
        }
    }

    //Index of pairs whose sum matches target
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                int ind = map.get(sub);
                int[] indices = new int[]{ind, i};
                return indices;
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }


}
