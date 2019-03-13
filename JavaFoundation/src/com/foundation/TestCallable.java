/*
 * @Title : TestCallable.java
 * 
 * @version V1.3.3
 * @date：2019年1月24日
 * @Copyright © 2019 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/** 
 * @ClassName: TestCallable 
 * @Description: TODO
 * @author zhangyu 
 * @date 2019年1月24日 
 *  
 */
public class TestCallable {
	
	static class CallableWorker implements Callable<String>{
		/**
		 * <p>Title: call</p> 
		 * <p>Description: </p> 
		 * @return
		 * @throws Exception 
		 * @see java.util.concurrent.Callable#call() 
		 */
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			System.out.println("tesxxt");
			return "test";
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableWorker worker = new CallableWorker();
		FutureTask<String> taskj = new FutureTask<String>(worker);
		long time = System.currentTimeMillis();
		new Thread(taskj).start();
		//get会阻塞，等待callable接口返回值
		taskj.cancel(true);
//		System.out.println(taskj.get());
		System.out.println((System.currentTimeMillis() - time));
	}

}
