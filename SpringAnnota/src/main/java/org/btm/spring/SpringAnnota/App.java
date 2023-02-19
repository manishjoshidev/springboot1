package org.btm.spring.SpringAnnota;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Spring Core Annotation
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung m21=factory.getBean(Samsung.class);
        m21.config();
    }
}
 