package array;

public class MinimumJumpToreachArrayEnd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {1, 3, 6, 1, 0, 9};

        System.out.println("Minimum number of jumps to reach end is : "
                + minJump(arr));

        int arr2[] = {1, 3, 5, 3, 1, 12, 6, 1, 1, 1, 1, 9};//{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum number of jumps to reach end is : "
                + minJump2(arr2));
    }

    private static int minJump(int arr[]) {

        int jumps[] = new int[arr.length];
        if (arr.length == 0 || arr[0] == 0) {
            return -1;
        }
        jumps[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {

                if (i <= j + arr[j]) {

                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    //break;
                }
            }
        }

        return jumps[arr.length - 1];
    }

    private static int minJump2(int arr[]) {
        int count = 0, maxRunningIthPosition = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, i + arr[i]);

            if (maxRunningIthPosition >= arr.length - 1)
                break;
            else if (max <= i)
                return -1;
            else if (i == maxRunningIthPosition) {//maxRunningIthPosition be will updated only
                // when it has iterated that many times of arr[i]
                maxRunningIthPosition = max;
                count++;
            }
        }

        return count;

    }

}
