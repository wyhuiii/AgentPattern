package com.wyh.staticproxy;

/**
* <p>Title: Scalper</p>  
* <p>Description: 静态代理中的代理类
* 特点：
* 1.与被代理类实现同一个接口，重写接口中的方法，在重写的方法中调用被代理类中的该方法，可以根据业务需求在调用被代理类前后执行其他逻辑。
* 2.定义一个构造方法，在该构造方法中需要传入一个参数，这个参数就是被代理对象。
* </p>  
* @author wyh
* @date Jul 6, 2019
*/
public class Scalper implements Subject{

	private Station station;
	public Scalper(Station station) {
		this.station = station;
	}
	
	@Override
	public void sell() {
		System.out.println("在调用被代理类对象的方法之前可以添加其他逻辑");
		station.sell();
		System.out.println("在调用被代理类对象的方法之后可以添加其他逻辑");
	}

}
