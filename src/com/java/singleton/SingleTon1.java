package com.java.singleton;

/**
 * ����ģʽ1������ʽ
 * @author ������
 */
public class SingleTon1 {

	// 1.˽�л���������ʹ�����ⲿ���ܹ����ô˹�����
	private SingleTon1() {
	}

	// 2��������ڲ��������ʵ����˽�л��˶���ֻ��ͨ����������������
	private static SingleTon1 instance = null;

	// 3��������ⲿͨ���������ô˷������ʵ�����˹�������ֻ��ͨ���������ã�
	//��˱���Ϊstatic���������ڲ���ʵ��Ҳ��Ҫstatic���������õĶ���(��̬��)
	public static SingleTon1 getInstance() {

		if (instance == null) {
			instance = new SingleTon1();
		}

		return instance;
	}

}
