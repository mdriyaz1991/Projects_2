package com.SearchAlgorithm;

public class BinarySearchTree {
	public int binarySearch(int[] inputArr, int key) {

		int start = 0;
		int counter = 1;
		int end = inputArr.length - 1;
		while (start <= end) {

			int mid = (start + end) / 2;
			System.out.println(" Mid value : " + counter + " - " + mid);
			counter++;
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		BinarySearchTree mbs = new BinarySearchTree();
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
		int[] arr1 = {6,34,78,123,432,900};
		System.out.println();
		System.out.println(" 432's position : ");
//		System.out.println("Key 432 position: " + mbs.binarySearch(arr1,432));
//		System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
		
		
		    }
}
