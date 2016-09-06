package com.java.sort;

/**
 * 直接插入排序
 * 
 * 基本思想： 
 * 在要排序的一组数中，假设前面(n-1)[n>=2]个数已经是排好顺序的,
 * 现在要把第n个数插入前面的有序数中，使得这n个数也是排好顺序的。
 * 如此反复循环，直到全部排好顺序。
 * 
 * @author 刘增刚
 */
public class InsertSort {

	public static void main(String[] args) {
		SortInputAndOutput sort = new SortInputAndOutput();
/*
 * 方法一：
 * 找到已经排好序的最后一位和要排序的数比较，若比其大，则交换值
 * 然后各自下标减去1，再比较，直到全部排好序。
 */
		int arr[] = sort.getRandom();
		long start = System.currentTimeMillis();
		for (int j = 1; j < arr.length; j++) {// 外层循环，要插入的数变化
			int a = j;// a表示刚开始比较的位置
			for (int k = j - 1; k >= 0; k--, a--) {// k表示之前排好序的最后位置
				int temp = 0;
				if (arr[a] < arr[k]) {// 如果要插入的数比之前序列的最大的数小，则需要互换值
					temp = arr[a];
					arr[a] = arr[k];
					arr[k] = temp;
				}

			}
		}
		long end = System.currentTimeMillis();
		//sort.output(arr);
		System.out.println("方法一耗时：" + (end - start));
		// ----------------------------------------------------------------------------
/*
 * 方法二：
 * 设置需要排序的数为哨兵temp2，倒序循环前面排好的序列，每个都和哨兵比，
 * 如果比哨兵大，则后移一位，最后空出来的即使哨兵位置。
 */
		long start2 = System.currentTimeMillis();
		int arr2[] = sort.getRandom();
		int temp2 = 0;
		for (int i = 1; i < arr2.length; i++) {//每次要插入的数的下标
			int j = i - 1;
			temp2 = arr2[i];
			for (; j >= 0 && temp2 < arr2[j]; j--) {
				arr2[j+1] = arr2[j];//将大于temp2的值后移一个位置
			}
			arr2[j+1] = temp2;
		}
		long end2 = System.currentTimeMillis();
		//sort.output(arr2);
		System.out.println("方法二耗时：" + (end2 - start2));
	}
	
	
//-------------------------------------------------------------------------
	/**
	 * 方法二明显比方法一效率高。
	 * 实际测试10000个数，则
	 * 方法一耗时：77ms
     * 方法二耗时：57ms
     * 方法一需要不停地互换，显然移位比互换值效率高。
	 */

}
