package com.java.singleton;

/**
 * 单例模式2：饿汉式 
 * @author 刘增刚
 */
public class SingleTon2 {

	// 1.私有化构造器，类外部无法调用
	private SingleTon2() {

	}

	// 2、在类内部创建实例，私有化此对象，通过公共的方法来调用，
	private static SingleTon2 instance = new SingleTon2();

	// 3、此公共方法只能让类来调用，所有必须声明为static，
	// 因此要求类的实例也必须为static，静态方法只能调用静态属性
	public static SingleTon2 getInstance() {
		return instance;
	}

}
