package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController {

	@RequestMapping("/add")
	public Double addition(Double number1, Double number2) {
		Double sum = number1 + number2;
		return sum;
	}

	@RequestMapping("/sub")
	public Double subtraction(Double number1, Double number2) {
		Double sum = number1 - number2;
		return sum;
	}

	@RequestMapping("/multi")
	public Double multiplication(Double number1, Double number2) {
		Double sum = number1 * number2;
		return sum;
	}

	@RequestMapping("/div")
	public Double division(Double number1, Double number2) {
		Double sum = number1 / number2;
		return sum;
	}
	
	
	/*
	@RequestMapping(path = "/") // URL path
	public Double calc(String number1, String number2, String sign) { // konstruktor med parametrar

		Double sum = (double) 0; // instanserar sum variabel och tilldelar värdet 0
		double num1 = Double.parseDouble(number1); // konverterar från sträng till double
		double num2 = Double.parseDouble(number2);

		// if & else satser som jämför "sign" från URL med olika räkne-sätten
		if (sign.equals("-")) {
			sum = num1 - num2; // summan utav nummer 1 & 2 från URL
			return sum; // returnerar summan
		} else if (sign.equals("+")) { // använd koden '%2B' istället för att skriva '+' tecknet i URL;en
			sum = num1 + num2;
			return sum;
		} else if (sign.equals("*")) {
			sum = num1 * num2;
			return sum;
		} else if (sign.equals("/")) {
			sum = num1 / num2;
			return sum;
		} else {
			return (double) 0;
		}
	}
	*/

}
