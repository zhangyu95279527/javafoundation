/*
 * @Title : TestCgligProxy.java
 * 
 * @version V1.3.3
 * @date：2018年12月12日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/** 
 * @ClassName: TestCgligProxy 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月12日 
 *  
 */
public class TestCgligProxy implements MethodInterceptor{

	/**
	 * <p>Title: intercept</p> 
	 * <p>Description: </p> 
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Throwable 
	 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.springframework.cglib.proxy.MethodProxy) 
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object value = proxy.invokeSuper(obj, args);
		System.out.println("invoke end");
		return value;
	}
}
