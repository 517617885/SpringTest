package com.angur.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @description 描述：
 * @author 作者 E-mail: Angur
 * @date 创建时间：2017年6月10日 下午1:42:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class Person {

	private static final Log log = LogFactory.getLog(Person.class);
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void info(){
		log.info("name：" + name + " age：" + age);
	}
}
