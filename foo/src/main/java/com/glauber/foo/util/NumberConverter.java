package com.glauber.foo.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class NumberConverter {

	public BigDecimal convertToBigDecimal(String strNumber) {
		strNumber = strNumber.replaceAll(",", ".");
		return new BigDecimal(strNumber,MathContext.DECIMAL128).setScale(6, RoundingMode.HALF_EVEN);
	}
	
	public boolean isNumeric(String str) {
		if (str == null)
			return false;
		String number = str.replaceAll(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
