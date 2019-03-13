/*
 * @Title : TestReflect.java
 * 
 * @version V1.3.3
 * @date：2018年12月12日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.foundation;

import java.lang.reflect.Constructor;

/**
 * @ClassName: TestReflect
 * @Description: TODO
 * @author zhangyu
 * @date 2018年12月12日
 * 
 */
public class TestReflect {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		String className = CgLibTeacher.class.getName();
		try {
			Class<?> forName = Class.forName(className);
			Constructor<?>[]  constr = forName.getConstructors();
			Constructor<CgLibTeacher> ctr = (Constructor<CgLibTeacher>) forName.getDeclaredConstructor(String.class);
//			CgLibTeacher teacher = (CgLibTeacher) forName.newInstance();
			//CgLibTeacher teacher = (CgLibTeacher) constr[1].newInstance("zhy");
			CgLibTeacher teacher = ctr.newInstance("zhy");
			teacher = CgLibTeacher.class.newInstance();
			System.out.println(teacher.setAge(20));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
