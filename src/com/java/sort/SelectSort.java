package com.java.sort;

/**
 * 简单选择排序
 * 
 * 基本思想：
 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，
 * 如此循环到倒数第二个数和最后一个数为止。
 * 
 * @author 刘增刚
 */
public class SelectSort {

	public static void main(String[] args) {
		SortInputAndOutput sort = new SortInputAndOutput();
		// int arr[] = sort.getArr();
		int arr[] = sort.getRandom();

		long start = System.currentTimeMillis();

		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			position = i;
			int temp = arr[i];
			for (; j < arr.length; j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					position = j;
				}
			}
			arr[position] = arr[i];
			arr[i] = temp;
		}

		long end = System.currentTimeMillis();
		System.out.println("简单选择排序耗时：" + (end - start));// 简单选择排序耗时：45ms

		// sort.output(arr);
	}

}
