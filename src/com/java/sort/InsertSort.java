package com.java.sort;

import java.util.Scanner;

/**
 * 直接插入排序
 * 
 * 基本思想： 在要排序的一组数中，假设前面(n-1)[n>=2]个数已经是排好顺序的,现在要把第n个数插入前面的有序数中，使得这n个数也是排好顺序的。
 * 如此反复循环，直到全部排好顺序。
 * 
 * @author 刘增刚
 */
public class InsertSort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (true) {
			String s = in.nextLine();// 接收一行
			String[] str = s.split(" ");// 转换成字符串数组
			int[] arr = new int[str.length];
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);// 转换成整型数组
			}
			for (int j = 1; j < arr.length; j++) {// 外层循环，要插入的数变化
				int a = j;//a表示刚开始比较的位置
				for (int k = j - 1; k >= 0; k--,a--) {//k表示之前排好序的最后位置
					int temp = 0;
					if (arr[a] < arr[k]) {//如果要插入的数比之前序列的最大的数小，则需要互换值
						temp = arr[a];
						arr[a] = arr[k];
						arr[k] = temp;
					}

				}
			}
			
			for(int i = 0;i < arr.length; i++){
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}

	}
}
