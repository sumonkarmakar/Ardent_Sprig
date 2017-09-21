package com.javat;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method methods, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("additional concern before actual logic");
	}

}
