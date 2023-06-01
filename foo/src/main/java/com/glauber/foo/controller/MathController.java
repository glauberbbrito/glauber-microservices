package com.glauber.foo.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.glauber.foo.exception.UnsuportedMathOperationException;
import com.glauber.foo.util.NumberConverter;
import com.glauber.foo.util.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath simpleMath = new SimpleMath();
	private NumberConverter numberConverter = new NumberConverter();

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public BigDecimal sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
				
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
			
		if (numberOne.compareTo(numberTwo) == 0)
			throw new NullPointerException("testando outras excptions");
				
		BigDecimal result = simpleMath.sum(numberConverter.convertToBigDecimal(numberOne), numberConverter.convertToBigDecimal(numberTwo));
		
		return result; 
	}
	
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public BigDecimal subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
				
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
			
		if (numberOne.compareTo(numberTwo) == 0)
			throw new NullPointerException("testando outras excptions");
		
		
		BigDecimal result = simpleMath.subtraction(numberConverter.convertToBigDecimal(numberOne), numberConverter.convertToBigDecimal(numberTwo));
	
		return result; 
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public BigDecimal multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
				
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
			
		if (numberOne.compareTo(numberTwo) == 0)
			throw new NullPointerException("testando outras excptions");
		
		
		BigDecimal result =  simpleMath.multiplication(numberConverter.convertToBigDecimal(numberOne), numberConverter.convertToBigDecimal(numberTwo));
	
		return result; 
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public BigDecimal division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
				
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
			
		if (numberOne.compareTo(numberTwo) == 0)
			throw new NullPointerException("testando outras excptions");
		
		BigDecimal result = simpleMath.division(numberConverter.convertToBigDecimal(numberOne), numberConverter.convertToBigDecimal(numberTwo));
	
		return result; 
	}
	
	@GetMapping("/mean/{numberOne}/{numberTwo}")
	public BigDecimal mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
				
		if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
			
		if (numberOne.compareTo(numberTwo) == 0)
			throw new NullPointerException("testando outras excptions");
		
		BigDecimal result = simpleMath.mean(numberConverter.convertToBigDecimal(numberOne), numberConverter.convertToBigDecimal(numberTwo));
	
		return result; 
	}
	
	@GetMapping("/squareRoot/{numberOne}")
	public BigDecimal squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {
				
		if (!numberConverter.isNumeric(numberOne))
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		
		BigDecimal result = simpleMath.squareRoot(numberConverter.convertToBigDecimal(numberOne));
	
		return result; 
	}
	
}
