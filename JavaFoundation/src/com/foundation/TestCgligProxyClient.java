/*
 * @Title : TestCgligProxyClient.java
 * 
 * @version V1.3.3
 * @date：2018年12月12日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @ClassName: TestCgligProxyClient
 * @Description: TODO
 * @author zhangyu
 * @date 2018年12月12日
 * 
 */
public class TestCgligProxyClient {
	public static void main(String[] args) {
		Enhancer hancer = new Enhancer();
		TestCgligProxy  proxy = new TestCgligProxy();
		hancer.setCallback(proxy);
		hancer.setSuperclass(CgLibTeacher.class);
		CgLibTeacher teacher = (CgLibTeacher) hancer.create();
		System.out.println(teacher.setAge(20));
	}

}
