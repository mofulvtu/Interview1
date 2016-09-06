package com.java.sort;

import java.util.Scanner;

public class SortInputAndOutput {
	
	/**
	 * 从控制台获取字符串并转换成整型数组
	 * @return
	 */
	public  int[] getArr() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();// 接收一行
		String[] str = s.split(" ");// 转换成字符串数组
		int[] arr = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);// 转换成整型数组
		}
		return arr;
	}
	
	/**
	 * 随机生成一万个随机数
	 * @return
	 */
	public int[] getRandom(){
		int arr[] = new int[10000];
		for(int i =0; i<10000;i++){
			
			arr[i] = (int) (Math.random()*(10000-0+1));
		}
		return arr;
	}
	
	/**
	 * 输出排序好的数组
	 * @param arr
	 */
	public void output(int[] arr){
		for(int i = 0;i < arr.length; i++){
			System.out.println(arr[i]+ " ");
		}
	}

}
