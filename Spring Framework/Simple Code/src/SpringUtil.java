//sample java class

package com.springutil.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import com.springutil.beans.*;
import org.springframework.core.SpringVersion;
import com.springutil.reqrespstatus.*;

public class SpringUtil{
	public static void main(String...params){
		ApplicationContext appContext= new ClassPathXmlApplicationContext("appilicationContext.xml");
		//Resource resource = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		User user = (User)appContext.getBean("userbean");

		String res = user.authenticate("somthing","cool!") == Status.OK ? "Bean Worked" : "Bean Broke";

		System.out.println(res+"\n\n"+SpringVersion.getVersion());
	}
}