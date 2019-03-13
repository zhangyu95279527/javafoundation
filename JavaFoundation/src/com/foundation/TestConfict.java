/*
 * @Title : TestConfict.java
 * 
 * @version V1.3.3
 * @date：2018年12月7日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: TestConfict 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月7日 
 *  
 */
public class TestConfict implements TestDefaultConfictInterface, TestDefaultConfictInterface2 {

	/**
	 * <p>Title: testB</p> 
	 * <p>Description: </p>  
	 * @see com.foundation.TestDefaultConfictInterface#testB() 
	 */
	@Override
	public void testB() {
		TestDefaultConfictInterface.super.testB();
	}
	public static void main(String[] args) {
		//默认方法冲突，子类
		TestDefaultConfictInterface2 confict = new TestConfict();
		 confict.testB();
	}
}
