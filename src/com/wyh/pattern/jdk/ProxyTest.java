package com.wyh.pattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//JDK动态代理测试类
public class ProxyTest {

	public static void main(String[] args) {
		 Subject subject = new Station();
		 InvocationHandler proxy = new Scalper(subject);
		 ClassLoader classLoader = subject.getClass().getClassLoader();
		 Class<?>[] interfaces = subject.getClass().getInterfaces();
		 /**
		  * Proxy：是动态代理类，返回代理类的一个实例，返回后的代理类可以当做被代理类使用（可使用被代理类在接口中声明过的方法）
		  * 用Proxy.newProxyInstance()动态创建代理类
		  * 参数一：类加载器
		  * 参数二：实现的接口
		  * 参数三：事件处理器
		  * 返回的就是动态产生的代理对象
		  */
		 Subject subjectProxy = (Subject)Proxy.newProxyInstance(classLoader, interfaces, proxy);
		 //代用代理对象的sell()方法时，其实是去调用Scalper的invoke()
		 subjectProxy.sell();
	}
}
