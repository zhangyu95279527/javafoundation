/*
 * @Title : TestProxy.java
 * 
 * @version V1.3.3
 * @date：2018年12月7日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @ClassName: TestProxy 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月7日 
 *  
 */
public class TestJDKProxy implements InvocationHandler{

	private Object obj;
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param obj 
	 */
	public TestJDKProxy(Object obj) {
		this.obj = obj;
	}

	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public TestJDKProxy() {
		super();
	}

	/**
	 * <p>Title: invoke</p> 
	 * <p>Description: </p> 
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("test proxy");
		Object value = method.invoke(obj, args);
		System.out.println("test proxy end");
		return value;
	}
	public static void main(String[] args) {
		ITeacher teacher = new Teacher();
		InvocationHandler handler = new TestJDKProxy(teacher);
		ITeacher teacher2 = (ITeacher) Proxy.newProxyInstance(null, teacher.getClass().getInterfaces(), handler);
//		System.out.println(teacher2.setAge(20));
		teacher2.setName("test zhy");
	}
}
