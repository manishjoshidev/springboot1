package org.btm.spring.AespectedOrientedProgram;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyWelcomeAdive implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Am from before Advice.."+method.getName());
		
	}
	
}
