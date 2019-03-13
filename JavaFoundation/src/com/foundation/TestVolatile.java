/*
 * @Title : TestVolatile.java
 * 
 * @version V1.3.3
 * @date：2019年1月22日
 * @Copyright © 2019 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.util.Random;

/** 
 * @ClassName: TestVolatile 
 * @Description: TODO
 * @author zhangyu 
 * @date 2019年1月22日 
 *  
 */
public class TestVolatile {
	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntValue intValue = new IntValue(0);
//		for(int k=0;k<1;k++){
//
//		}
		Worker worker = new Worker(intValue);
		worker.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果不是volatile死循环了就
		worker.setRunning(false);
		System.out.println(worker.getI());
	}
	static class IntValue {
		private int i=0;
		/** 
		 * <p>Title: </p> 
		 * <p>Description: </p> 
		 * @param i 
		 */
		public IntValue(int i) {
			super();
			this.i = i;
		}

		/**
		 * @return the i
		 */
		public int getI() {
			return i;
		}

		/**
		 * @param i the i to set
		 */
		public void setI(int k) {
			System.out.println(k);
			this.i = k;
//			System.out.println(this.i);
		}
		
	}

	static class Worker extends Thread{
		private IntValue intValue;
		private volatile boolean isRunning = true;
		/**
		 * @return the isRunning
		 */
		public boolean isRunning() {
			return isRunning;
		}

		/**
		 * @param isRunning the isRunning to set
		 */
		public void setRunning(boolean isRunning) {
			this.isRunning = isRunning;
		}

		private int i=0;
		/** 
		 * <p>Title: </p> 
		 * <p>Description: </p> 
		 * @param intValue 
		 * @param i 
		 */
		public Worker(IntValue intValue) {
			this.intValue = intValue;
		}

		/**
		 * <p>Title: run</p> 
		 * <p>Description: </p>  
		 * @see java.lang.Thread#run() 
		 */
		@Override
		public void run() {
			while(isRunning){
				i++;
			}
		}
		
		public int getI() {
			return i;
		}

		
	}
}
