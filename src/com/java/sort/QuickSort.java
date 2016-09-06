package com.java.sort;

/**
 * 快速排序
 * 
 * 基本思想：
 * 选择一个基准元素，通常选择第一个元素或者最后一个元素，通过一趟扫描，将待排序列分成两部分，
 * 一部分比基准元素小，一部分大于等于基准元素，此时基准元素在其排好序后的正确位置，然后再用
 * 同样的方法 递归地排序划分的两部分。
 * 
 * @author 刘增刚
 *
 */
public class QuickSort {

	public int adujstArray(int arr[], int left, int right) {
		int i = left, j = right;
		int pivot = arr[left];
		while (i < j) {
			// 从右向左找小于pivot的数来填arr[i]
			while (i < j && arr[j] >= pivot)
				j--;
			if (i < j) {
				arr[i] = arr[j];// 将arr[j]填到arr[i]中，arr[j]形成一个新的坑
				i++;
			}

			// 从左向右找大于或等于pivot的数来瑱arr[j]
			while (i < j && arr[i] < pivot)
				i++;
			if (i < j) {
				arr[j] = arr[i];// 将arr[i]填到arr[j]中，arr[i]形成一个新的坑
				j--;
			}

		}
		//退出时，i等于j。将pivot填到这个坑中
		arr[i] = pivot;

		return i;
	}

	public void quick_sort(int arr[], int left, int right) {
		if (left < right) {
			int i = adujstArray(arr, left, right);
			quick_sort(arr, left, i - 1);
			quick_sort(arr, i+1, right);

		}
	}

	public static void main(String[] args) {
		SortInputAndOutput sort = new SortInputAndOutput();
//		int arr[] = sort.getArr();
		int arr[] = sort.getRandom();
		sort.output(arr);
		QuickSort quickSort = new QuickSort();
		long start = System.currentTimeMillis();
		System.out.println(start);
		quickSort.quick_sort(arr, 0, arr.length - 1);
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("快速排序耗时：" + (end-start));//快速排序耗时：15ms
		sort.output(arr);
		

	}

}
