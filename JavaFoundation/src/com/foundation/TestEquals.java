/*
 * @Title : Testquals.java
 * 
 * @version V1.3.3
 * @date：2018年12月6日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: Testquals 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月6日 
 *  
 */
public class TestEquals {
	static {
		System.out.println("xxx");
	}
	public static void main(String[] args) {
		//自动调用了Integer.valueOf();
		Integer i = 127;
		Integer s = 127; 
		//如果String缓冲池内不存在与其指定值相同的String对象，那么此时虚拟机将为此创建新的String对象，并存放在String缓冲池内。
		//如果String缓冲池内存在与其指定值相同的String对象，那么此时虚拟机将不为此创建新的String对象，而直接返回已存在的String对象的引用。
		String t = "1000x";
		String u = "1000x";
		System.out.println(i==s);
		System.out.println(t==u);
		i = 128;
		s = 128; 
		System.out.println(i==s);
		int k= 128;
		//i拆箱了
		System.out.println(i==k);
	}
}
