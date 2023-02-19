package org.btm.spring.AespectedOrientedProgram;

import java.lang.invoke.ClassSpecializer.Factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OurLogic {
public static void main(String[]args)
{
	Resource res=new ClassPathResource("spconfig.xml");
	BeanFactory fatory=new XmlBeanFactory(res);
	
	MyInterface inter=(MyInterface)Factory.getBean("id4");
	inter.m1();
	System.out.println("............");
	inter.m2();
	
}
}
