package com.unfbx.pojo;

/**
 * @Description
 * @Author Grt
 * @Date 2021-06-29
 */
public class B {
	public B() {
		System.out.println("B----------------->CREATED");
	}
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
