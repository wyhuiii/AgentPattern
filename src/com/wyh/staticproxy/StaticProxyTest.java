package com.wyh.staticproxy;

/**
* <p>Title: StaticProxyTest</p>  
* <p>Description: 静态代理测试类</p>  
* @author wyh
* @date Jul 6, 2019
*/
public class StaticProxyTest {
	public static void main(String[] args) {
		//由于代理对象在创建时构造函数需要传入一个被代理对象，所以在创建代理类对象之前需要创建一个被代理类对象
		Station station = new Station();
		Scalper scalper = new Scalper(station);
		scalper.sell();
	}

}
