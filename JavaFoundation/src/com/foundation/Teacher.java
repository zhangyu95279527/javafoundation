/*
 * @Title : Teacher.java
 * 
 * @version V1.3.3
 * @date：2018年12月12日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

/** 
 * @ClassName: Teacher 
 * @Description: TODO
 * @author zhangyu 
 * @date 2018年12月12日 
 *  
 */
public class Teacher  implements ITeacher, ITeacherAge{
	private String name;
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
		System.out.println("setNamexxx "+name);
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
	
	
	
}
