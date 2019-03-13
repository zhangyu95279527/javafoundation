/*
 * @Title : TestClone.java
 * 
 * @version V1.3.3
 * @date：2018年12月7日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.util.Date;

/** 
 * @ClassName: TestClone 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月7日 
 *  
 */
public class TestClone implements Cloneable{
	private String name; 
	private Integer age;
	private Date bornDate;
	private TestClone cloneData;
	/**
	 * @return the cloneData
	 */
	public TestClone getCloneData() {
		return cloneData;
	}
	/**
	 * @param cloneData the cloneData to set
	 */
	public void setCloneData(TestClone cloneData) {
		this.cloneData = cloneData;
	}
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		//浅
//		TestClone clone = new TestClone("zhang", 20, new Date());
//		System.out.println(clone.getBornDate());
//		Thread.sleep(2000);
//		TestClone data = (TestClone) clone.clone();
//		data.setBornDate(new Date());
//		System.out.println(clone.getBornDate());
		//深
		TestClone clone = new TestClone("zhang", 20, new Date());
		TestClone clone1 = new TestClone("zhang2", 23, new Date());
		clone.setCloneData(clone1);
		System.out.println(clone.getCloneData().getBornDate());
		Thread.sleep(2000);
		TestClone data = (TestClone) clone.clone();
		data.getCloneData().setBornDate(new Date());
		System.out.println(clone.getCloneData().getBornDate());
	}
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param name
	 * @param age
	 * @param bornDate 
	 */
	public TestClone(String name, Integer age, Date bornDate) {
		super();
		this.name = name;
		this.age = age;
		this.bornDate = bornDate;
	}
	
	
	/**
	 * <p>Title: clone</p> 
	 * <p>Description: </p> 
	 * @return
	 * @throws CloneNotSupportedException 
	 * @see java.lang.Object#clone() 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		TestClone clone = (TestClone) super.clone();
//		clone.setCloneData((TestClone) clone.getCloneData().clone());
		return clone;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the bornDate
	 */
	public Date getBornDate() {
		return bornDate;
	}

	/**
	 * @param bornDate the bornDate to set
	 */
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	
}
