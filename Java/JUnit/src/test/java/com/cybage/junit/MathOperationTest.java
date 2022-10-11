 package com.cybage.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class MathOperationTest {
	static MathOperation math=null;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before classs method");
		math=new MathOperation();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after classs method");
		math=null;
	}
	@Before
	public void before()
	{
		System.out.println("before method.");
	}
	
	@After
	public void After()
	{
		System.out.println("after method.");
	}
	
	@Test
	public final void testAdd() {
		MathOperation math = new MathOperation();
		assertEquals(8, math.add(4, 4));
	}

	@Test
	public final void testSub() {
		MathOperation math = new MathOperation();
		assertEquals(6, math.sub(8, 2));
	}

}
