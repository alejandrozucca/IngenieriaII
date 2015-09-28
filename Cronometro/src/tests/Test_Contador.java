package tests;

import main.Cronometro;
import junit.framework.*;

public class Test_Contador extends TestCase {

	@Test
	public void test01(){
		
		Cronometro c = new Cronometro();
		
		for (int i=0; i < 5000; i++) {
			  c.incrementarTiempo();
			}
		
		int minutos = c.mostrarMinutos();
		int segundos = c.mostrarSegundos();
		
		Assert.assertTrue(minutos==5);
		Assert.assertTrue(segundos==3);
	}
	
	
}
