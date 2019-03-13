/*
 * @Title : TestInterface.java
 * 
 * @version V1.3.3
 * @date：2018年12月7日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: TestInterface 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月7日 
 *  
 */
public interface TestInterface {
	public static String testGet(){
		return "";
	}
	String getValue();
	default String testGetxx(){
		return getValue();
	}
	default String testGetxxxx(){
		return "";
	}
}
