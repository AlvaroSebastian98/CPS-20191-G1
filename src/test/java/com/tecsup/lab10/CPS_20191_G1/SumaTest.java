package com.tecsup.lab10.CPS_20191_G1;

import org.junit.Assert;
import org.junit.Test;

public class SumaTest {
	
	@Test
	public void testSuma() {
		Assert.assertTrue(true);
	}
	
	//TDD
	
	/**
	 * Prueba: Validar que el método sume los dos números
	 **/
	
	@Test
	public void testSumar() {
		Suma s = new Suma();
		
		int RESULTADO = 6;
		int num1 = 2;
		int num2 = 4;
		
		int suma = s.sumar(num1, num2);
		
		// Si suma es 6 => OK
		Assert.assertEquals(RESULTADO, suma);
	}
}
