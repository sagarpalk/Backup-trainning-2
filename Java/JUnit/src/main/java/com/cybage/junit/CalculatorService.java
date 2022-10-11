package com.cybage.junit;

public class CalculatorService {

	
      private AddService addService;
	
	public CalculatorService(AddService addService) {
		this.addService = addService;
	}

	public int calc(int num1, int num2) {
		System.out.println("**--- CalcService calc executed ---**");
		return addService.add(num1, num2);
	}
}
