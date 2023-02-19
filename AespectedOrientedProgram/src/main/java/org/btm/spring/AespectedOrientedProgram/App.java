package org.btm.spring.AespectedOrientedProgram;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args ){
    	Resource rs=new ClassPathResource("advice.xml");
    	BeanFactory bef=new  XmlBeanFactory(rs);
    	
    	MyInterface mi=(MyInterface)bef.getBean("proxy");
    	mi.m1();
    	mi.m2();
    }
}
