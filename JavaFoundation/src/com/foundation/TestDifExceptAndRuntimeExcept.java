/*
 * @Title : TestDifExceptAndRuntimeExcept.java
 * 
 * @version V1.3.3
 * @date：2019年2月28日
 * @Copyright © 2019 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.io.PrintStream;
import java.io.PrintWriter;

/** 
 * @ClassName: TestDifExceptAndRuntimeExcept 
 * @Description: TODO
 * @author zhangyu 
 * @date 2019年2月28日 
 *  
 */
public class TestDifExceptAndRuntimeExcept {
	public static void main(String[] args) {
		testRuntimeExcep();
		try {
			testExcep();
		} catch (TExce e) {
			e.printStackTrace();
		}
	}
	
	private static void testRuntimeExcep() throws TRunExc{
		throw new TRunExc();
	}
	private static void testExcep() throws TExce{
		throw new TExce();
	}
	
	static class TExce extends Exception{

		/** 
		* @Fields serialVersionUID : TODO
		*/ 
		private static final long serialVersionUID = 3496091268242448937L;
		
	}
	
	static class TRunExc extends RuntimeException{

		/** 
		* @Fields serialVersionUID : TODO
		*/ 
		private static final long serialVersionUID = 8681608582127161303L;

		/**
		 * <p>Title: getMessage</p> 
		 * <p>Description: </p> 
		 * @return 
		 * @see java.lang.Throwable#getMessage() 
		 */
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return super.getMessage();
		}

		/**
		 * <p>Title: getLocalizedMessage</p> 
		 * <p>Description: </p> 
		 * @return 
		 * @see java.lang.Throwable#getLocalizedMessage() 
		 */
		@Override
		public String getLocalizedMessage() {
			// TODO Auto-generated method stub
			return super.getLocalizedMessage();
		}

		/**
		 * <p>Title: getCause</p> 
		 * <p>Description: </p> 
		 * @return 
		 * @see java.lang.Throwable#getCause() 
		 */
		@Override
		public synchronized Throwable getCause() {
			// TODO Auto-generated method stub
			return super.getCause();
		}

		/**
		 * <p>Title: initCause</p> 
		 * <p>Description: </p> 
		 * @param cause
		 * @return 
		 * @see java.lang.Throwable#initCause(java.lang.Throwable) 
		 */
		@Override
		public synchronized Throwable initCause(Throwable cause) {
			// TODO Auto-generated method stub
			return super.initCause(cause);
		}

		/**
		 * <p>Title: toString</p> 
		 * <p>Description: </p> 
		 * @return 
		 * @see java.lang.Throwable#toString() 
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		/**
		 * <p>Title: printStackTrace</p> 
		 * <p>Description: </p>  
		 * @see java.lang.Throwable#printStackTrace() 
		 */
		@Override
		public void printStackTrace() {
			// TODO Auto-generated method stub
			super.printStackTrace();
		}

		/**
		 * <p>Title: printStackTrace</p> 
		 * <p>Description: </p> 
		 * @param s 
		 * @see java.lang.Throwable#printStackTrace(java.io.PrintStream) 
		 */
		@Override
		public void printStackTrace(PrintStream s) {
			// TODO Auto-generated method stub
			super.printStackTrace(s);
		}

		/**
		 * <p>Title: printStackTrace</p> 
		 * <p>Description: </p> 
		 * @param s 
		 * @see java.lang.Throwable#printStackTrace(java.io.PrintWriter) 
		 */
		@Override
		public void printStackTrace(PrintWriter s) {
			// TODO Auto-generated method stub
			super.printStackTrace(s);
		}

		/**
		 * <p>Title: fillInStackTrace</p> 
		 * <p>Description: </p> 
		 * @return 
		 * @see java.lang.Throwable#fillInStackTrace() 
		 */
		@Override
		public synchronized Throwable fillInStackTrace() {
			// TODO Auto-generated method stub
			return super.fillInStackTrace();
		}

		/**
		 * <p>Title: getStackTrace</p> 
		 * <p>Description: </p> 
		 * @return 
		 * @see java.lang.Throwable#getStackTrace() 
		 */
		@Override
		public StackTraceElement[] getStackTrace() {
			// TODO Auto-generated method stub
			return super.getStackTrace();
		}

		/**
		 * <p>Title: setStackTrace</p> 
		 * <p>Description: </p> 
		 * @param stackTrace 
		 * @see java.lang.Throwable#setStackTrace(java.lang.StackTraceElement[]) 
		 */
		@Override
		public void setStackTrace(StackTraceElement[] stackTrace) {
			// TODO Auto-generated method stub
			super.setStackTrace(stackTrace);
		}
	}
}
