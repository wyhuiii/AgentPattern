package com.wyh.pattern.jdk;

/**
* <p>Title: Station</p>  
* <p>Description: 被代理类</p>  
* @author wyh
* @date Jul 6, 2019
 */
public class Station implements Subject {

	@Override
	public void sell() {

		System.out.println("买票");
	}
	
	public void change() {
		System.out.println("改签");
	}

}
