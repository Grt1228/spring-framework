package com.unfbx.pojo;

/**
 * @Description
 * @Author Grt
 * @Date 2021-06-29
 */
public class A {
	public A() {
		System.out.println("A----------------->CREATED");
	}

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
