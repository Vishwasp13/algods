package com.algods.binarysearch;

public class SearchInAscendingSortedArray {
	public static void main(String args[]) {		
		int[] testdata = new int[]{9,8,7,6,5,4,3,2,1};
		getIndex(testdata, 7);		
	}
	public static void getIndex(int[] ascending, int number) {
		
			int first = isAscendingSorted(ascending) ? 0 : ascending.length-1;
			int last = isAscendingSorted(ascending) ? ascending.length -1 : 0;
			boolean run = true;
			
			while(run) {
				int mid = (first + last)/2;				
				if(number > ascending[mid]) {
					first = (mid+1);
				}
				else if(number < ascending[mid]) {
					last = (mid -1);
				}
				else {
					System.out.println("Index found "+mid);
					run = false;
				}
			}
	}
	
	public static boolean isAscendingSorted(int[] sortedArray) {
		return (sortedArray[0] > sortedArray[sortedArray.length-1])? false : true;
	}

}
