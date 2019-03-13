/*
 * @Title : TestDefaultConfictInterface.java
 * 
 * @version V1.3.3
 * @date：2018年12月7日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: TestDefaultConfictInterface 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月7日 
 *  
 */
public interface TestDefaultConfictInterface2 {
	public static String testA(){
		return "TestDefaultConfictInterface2 testA";
	}
	default void testB(){
		System.out.println(testA()+" testB");
	}
}
