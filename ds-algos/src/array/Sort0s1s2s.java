package array;

public class Sort0s1s2s {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {0,2,1,2,0};
        sort012(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }

    public static void sort012(int a[]) {
        int mid = 0, low = 0, high = a.length - 1;

        while (mid <= high) {

            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
    }
}
