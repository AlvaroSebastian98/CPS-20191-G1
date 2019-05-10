package com.tecsup.lab10.CPS_20191_G1;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicacionTest {
	
	@Test
	public void testMultiplicacion()
    {
        Assert.assertTrue( true );
    }
	
	@Test
	public void testMultiplicar() {
		int VALOR_ESPERADO=25;
		int A=5;
		int B=5;
		
		Multiplicacion m=new Multiplicacion();
		
		int R=m.multiplicar(A, B);
		
		Assert.assertEquals(R,VALOR_ESPERADO);
	}
	
}
