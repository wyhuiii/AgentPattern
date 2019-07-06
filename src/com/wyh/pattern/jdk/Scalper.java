package com.wyh.pattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* <p>Title: Scalper</p>  
* <p>Description: 代理类，不用实现Subject接口，只需要实现InvocationHandler接口即可</p>  
* @author wyh
* @date Jul 6, 2019
 */
public class Scalper implements InvocationHandler {

	
	private Object target;
	
	//这里的构造方法中传入的 参数是被代理类对象
	public Scalper(Object target) {
		this.target = target;
	}

	/**
	 * <p>Title: invoke</p>  
	 * <p>Description: 实现InvocationHandler接口中的方法</p>  
	 * @param proxy:被代理类对象
	 * @param method：被代理类对象调用的方法
	 * @param args：被代理类对象调用的方法所需要的参数数组
	 * @return：返回的是被调用的方法的返回值
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//在调用被代理类对象之前，可以加上自己的逻辑（此处使用打印输出代替业务）
		System.out.println("调用方法前添加逻辑");
		/**
		 * method.invoke(target, args)；底层帮我们调用被代理对象的方法
		 * 参数一是构造方法中传入的对象，参数二是被代理对象的方法中需要的参数
		 * 这里我们要调用的sell()方法中是不需要参数的，所以就把第二个参数去掉了
		 */
		Object result = method.invoke(target);
		//在调用被代理对象之后，可以加上自己的逻辑
		System.out.println("调用方法后添加自己的逻辑");
		return result;
	}

}
