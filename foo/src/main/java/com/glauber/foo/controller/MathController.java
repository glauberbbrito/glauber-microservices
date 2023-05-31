package com.glauber.foo.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public BigDecimal sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if (!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new Exception();
		
		BigDecimal sum = new BigDecimal(numberOne).add(new BigDecimal(numberTwo));
		
		return sum; 
	}

	private boolean isNumeric(String str) {
		if (str == null)
			return false;
		String number = str.replaceAll(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
