/*
 * @Title : CgLibTeacher.java
 * 
 * @version V1.3.3
 * @date：2018年12月12日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: CgLibTeacher 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月12日 
 *  
 */
public class CgLibTeacher {
	private String name;
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public CgLibTeacher() {
		// TODO Auto-generated constructor stub
	}
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param name 
	 */
	public CgLibTeacher(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("setName "+name);
		this.name = name;
	}
	/**
	 * <p>Title: setAge</p> 
	 * <p>Description: </p> 
	 * @param age
	 * @return 
	 * @see com.foundation.ITeacherAge#setAge(int) 
	 */
	public Integer setAge(int age) {
		System.out.println("setAge "+age);
		return age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	} 
	
}
