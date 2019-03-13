/*
 * @Title : TestThreadSafeCollections.java
 * 
 * @version V1.3.3
 * @date：2019年1月24日
 * @Copyright © 2019 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: TestThreadSafeCollections 
 * @Description: TODO
 * @author zhangyu 
 * @date 2019年1月24日 
 *  
 */
public class TestThreadSafeCollections {
	private static Map<String, Long> map = new HashMap<>();
	
	public static void main(String[] args) {
		
	}
	static class Worker extends Thread{

		/**
		 * <p>Title: run</p> 
		 * <p>Description: </p>  
		 * @see java.lang.Thread#run() 
		 */
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		}
		
	}
	
}
