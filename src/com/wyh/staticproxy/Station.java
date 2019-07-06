package com.wyh.staticproxy;

/**
* <p>Title: Station</p>  
* <p>Description: 静态代理中的被代理类
* 特点：实现接口中的方法
* </p>  
* @author wyh
* @date Jul 6, 2019
*/
public class Station implements Subject{

	//重写接口中的方法
	@Override
	public void sell() {
		System.out.println("售票");
	}

	//根据需求自定义本类中的其他方法
	public void change() {
		System.out.println("改签");
	}
	
}
