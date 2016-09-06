package com.java.sort;

/**
 * 希尔排序
 * 
 * 基本思想： 
 * 算法先将要排序的一组数按某个增量d(n/2,n为要排序的个数)分成若干组，每组中记录的
 * 下表相差d，对每组中全部元素进行直接插入排序，然后再用一个较小的增量(d/2)对它
 * 进行分组，在每组中再进行直接插入排序。
 * 当增量减到1时，进行直接插入排序后，排序完成。
 * 
 * @author 刘增刚
 * 
 */
public class ShellSort {

	public static void main(String[] args) {
		SortInputAndOutput sort = new SortInputAndOutput();
		int[] arr = sort.getRandom();// 获取需要排列的整型数组
		int d = arr.length;
		int temp = 0;
		long start = System.currentTimeMillis();

		while (true) {
			d = d / 2;
			for (int k = 0; k < d; k++) {
				for (int i = k + d; i < arr.length; i += d) {
					int j = i - d;
					temp = arr[i];
					for (; j >= 0 && temp < arr[j]; j--) {
						arr[j + d] = arr[j];
					}
					arr[j + d] = temp;
				}
			}
			if (d == 1) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("希尔排序耗时：" + (end - start));//希尔排序耗时：45ms
		//sort.output(arr);

	}

}
