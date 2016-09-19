package com.java.singleton;

public class TestSingleTon {

	public static void main(String[] args) {
		//≤‚ ‘¿¡∫∫ Ω
		SingleTon1 s1 = SingleTon1.getInstance();
		SingleTon1 s2 = SingleTon1.getInstance();
		System.out.println(s1 == s2);// true

		//≤‚ ‘∂ˆ∫∫ Ω
		SingleTon2 s1_ = SingleTon2.getInstance();
		SingleTon2 s2_ = SingleTon2.getInstance();
		System.out.println(s1_ == s2_);//true
	}

}
