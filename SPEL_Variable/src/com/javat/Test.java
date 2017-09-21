package com.javat;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calculation=new Calculation();  
		StandardEvaluationContext context=new StandardEvaluationContext(calculation);  
		      
		ExpressionParser parser = new SpelExpressionParser();  
		parser.parseExpression("number").setValue(context,"10");  
		      
		System.out.println(calculation.cube());  
	}

}
