package com.cybage.junit;

import static org.junit.Assert.*;


import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
     
	@InjectMocks
	CalculatorService calcService;

	@Mock
	private AddService addService;

	/*@BeforeEach
	public void setup() {
		System.out.println("@BeforeEach CalcService2Test");
		MockitoAnnotations.initMocks(this);
	}*/

	@Test
	public void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");

	//calcService = new CalculatorService(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);

		assertEquals(expected, actual);

	}

}
