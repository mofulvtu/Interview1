package com.java.sort;

/**
 * 冒泡排序
 * 
 * 基本思想： 在要排序的一组数中，对当前还未排好序的范围内的全部数，
 * 自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的数往上冒。
 * 即:每当两相邻的数比较后发现他们的顺序与要求相反时，就互换。
 * 
 * @author 刘增刚
 * 
 */
public class BubbingSort {

	public static void main(String[] args) {
		SortInputAndOutput sort = new SortInputAndOutput();
		//int arr[] = sort.getArr();
		int arr[] = sort.getRandom();
		int temp = 0;

		long start = System.currentTimeMillis();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

		long end = System.currentTimeMillis();
		System.out.println("冒泡排序耗时：" + (end - start));//冒泡排序耗时：160ms
        //sort.output(arr);
	}

}
