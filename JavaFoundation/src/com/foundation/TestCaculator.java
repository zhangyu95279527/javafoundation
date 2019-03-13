/*
 * @Title : TestCaculator.java
 * 
 * @version V1.3.3
 * @date：2019年2月18日
 * @Copyright © 2019 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: TestCaculator 
 * @Description: TODO
 * @author zhangyu 
 * @date 2019年2月18日 
 *  
 */
public class TestCaculator {
	
	static int[] array = { 36000, 144000, 300000, 420000, 660000, 960000 };
	static int [] rateArr = {3, 10, 20,25,30,35,45};
	static int [] rateValue = {0,2520, 16920, 31920,52920,85920,181920};
	public static void main(String[] args) {
		SalaryInfo salaryInfo = new SalaryInfo(1000, 913, 2000);
		int base = 5000;
		int lastMonth = 0;
		int sum = 0;
		for(int i=1;i<=12;i++){
			int tax = salaryInfo.calTax(i, base, lastMonth);
			lastMonth+=tax;
			sum+=(salaryInfo.getSalary() - tax - 913 );
			System.out.println( i + "月份 "  + "税后："+(salaryInfo.getSalary() - tax - 913 )+" 扣税："  + tax);
		}
		System.out.println(sum);
	}
	
	static class SalaryInfo {
		private Integer salary;
		private Integer insurance;
		private Integer reduce;
		/** 
		 * <p>Title: </p> 
		 * <p>Description: </p> 
		 * @param salary
		 * @param insurance 
		 */
		public SalaryInfo(Integer salary, Integer insurance) {
			this.salary = salary;
			this.insurance = insurance;
		}
		
		
		
		/** 
		 * @Title: calTax 
		 * @Description: TODO
		 * @param i
		 * @param base
		 * @return
		 */
		public Integer calTax(int month, int base, int lastMonth) {
			int total = (this.salary - base - this.insurance - this.reduce)*month;
			int rate = rateArr[0];
			int rateVal = rateValue[0];
			for (int i = 0; i < array.length; i++) {
				int bvalue = array[i];
				if ((total - bvalue) <= 0) {
					rate = rateArr[i];
					rateVal = rateValue[i];
					break;
				}
			}
			//System.out.println("---------"+total + "    --rate "+rate+"  -- rateVal" +rateVal + " lastMonth" +  lastMonth);
			return total*rate/100 - rateVal - lastMonth;
		}



		/** 
		 * <p>Title: </p> 
		 * <p>Description: </p> 
		 * @param salary
		 * @param insurance
		 * @param reduce 
		 */
		public SalaryInfo(Integer salary, Integer insurance, Integer reduce) {
			super();
			this.salary = salary;
			this.insurance = insurance;
			this.reduce = reduce;
		}


		/**
		 * @return the reduce
		 */
		public Integer getReduce() {
			return reduce;
		}



		/**
		 * @param reduce the reduce to set
		 */
		public void setReduce(Integer reduce) {
			this.reduce = reduce;
		}



		/**
		 * @return the salary
		 */
		public Integer getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		/**
		 * @return the insurance
		 */
		public Integer getInsurance() {
			return insurance;
		}
		/**
		 * @param insurance the insurance to set
		 */
		public void setInsurance(Integer insurance) {
			this.insurance = insurance;
		}
		
	}
}
