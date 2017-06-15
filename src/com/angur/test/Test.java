package com.angur.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @description 描述：
* @author  作者 E-mail: Angur
* @date 创建时间：2017年6月10日 下午1:50:26 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = context.getBean("person", Person.class);
		person.info();
	}
}
