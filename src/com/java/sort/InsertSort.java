package com.java.sort;

import java.util.Scanner;

/**
 * ֱ�Ӳ�������
 * 
 * ����˼�룺 ��Ҫ�����һ�����У�����ǰ��(n-1)[n>=2]�����Ѿ����ź�˳���,����Ҫ�ѵ�n��������ǰ����������У�ʹ����n����Ҳ���ź�˳��ġ�
 * ��˷���ѭ����ֱ��ȫ���ź�˳��
 * 
 * @author ������
 */
public class InsertSort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (true) {
			String s = in.nextLine();// ����һ��
			String[] str = s.split(" ");// ת�����ַ�������
			int[] arr = new int[str.length];
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);// ת������������
			}
			for (int j = 1; j < arr.length; j++) {// ���ѭ����Ҫ��������仯
				int a = j;//a��ʾ�տ�ʼ�Ƚϵ�λ��
				for (int k = j - 1; k >= 0; k--,a--) {//k��ʾ֮ǰ�ź�������λ��
					int temp = 0;
					if (arr[a] < arr[k]) {//���Ҫ���������֮ǰ���е�������С������Ҫ����ֵ
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
