package com.tecsup.lab10.CPS_20191_G1;
import org.junit.Assert;
import org.junit.Test;

public class RestaTest {
	@Test
	public void testResta() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void testRestar(){
		int A=6;
		int B=4;
		int valoresperado=2;
		
		Resta x=new Resta();
		int r=x.resta(A,B);
		
		Assert.assertEquals(r, valoresperado);
		
		
		
	}
}
