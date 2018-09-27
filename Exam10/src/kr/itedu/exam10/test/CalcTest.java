package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import kr.itedu.ex10.Calc;

public class CalcTest {
	@Test 
		void test() {
		assertEquals(5, Calc.sum(1, 4));
		assertEquals(7, Calc.sum(2, 5));
		assertEquals(9, Calc.sum(3, 6));
	}
	
	
	
}
