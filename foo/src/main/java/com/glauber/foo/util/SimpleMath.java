package com.glauber.foo.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SimpleMath {

	public BigDecimal sum(BigDecimal numberOne, BigDecimal numberTwo)  {				
		BigDecimal result = numberOne.add(numberTwo);
		
		return result; 
	}
	
	public BigDecimal subtraction(BigDecimal numberOne, BigDecimal numberTwo) throws Exception {
			
		BigDecimal result = numberOne.subtract(numberTwo).setScale(2, RoundingMode.HALF_EVEN);
	
		return result; 
	}
	
	public BigDecimal multiplication(BigDecimal numberOne, BigDecimal numberTwo) throws Exception {
		BigDecimal result = numberOne.multiply(numberTwo).setScale(2, RoundingMode.HALF_EVEN);
	
		return result; 
	}
	
	public BigDecimal division(BigDecimal numberOne, BigDecimal numberTwo) throws Exception {
		BigDecimal result = numberOne.divide(numberTwo,RoundingMode.HALF_EVEN).setScale(2, RoundingMode.HALF_EVEN);
	
		return result; 
	}
	
	public BigDecimal mean(BigDecimal numberOne, BigDecimal numberTwo) throws Exception {
		BigDecimal result = numberOne.add(numberTwo).divide(BigDecimal.TWO, MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_EVEN);
	
		return result; 
	}
	
	public BigDecimal squareRoot(BigDecimal numberOne) throws Exception {
		
		BigDecimal result = numberOne.sqrt(MathContext.DECIMAL128);
	
		return result; 
	}
	
}
