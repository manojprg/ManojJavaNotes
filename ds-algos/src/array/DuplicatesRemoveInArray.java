package array;

import java.util.Arrays;

public class DuplicatesRemoveInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,1};
		removeduplicates(arr);
		
	}
	
	static void removeduplicates(int arr[]) {
		
		Arrays.sort(arr);
		int prev=-1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1] || prev==arr[i] ) {
				if(prev==arr[i]) {
					arr[i]=0;
				}else {
				arr[i+1]=0;
				prev=arr[i];
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
