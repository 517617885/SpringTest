package com.angur.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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

	@org.junit.Test
	public void testClassPathInfo() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = context.getBean("person", Person.class);
		person.info();
	}
	
	@org.junit.Test
	public void testSimpleLoad(){
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		Person person = (Person) bf.getBean("person");
		person.info();
	}
}
