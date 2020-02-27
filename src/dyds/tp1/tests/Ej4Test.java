package dyds.tp1.tests;

import dyds.tp1.ej4.NotificarPorMail;
import dyds.tp1.ej4.Orden;
import dyds.tp1.ej4.ProcesadorDeOrdenes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Ej4Test {
	
	@Test
	public void test() {
		
		ProcesadorDeOrdenes procesador =  new ProcesadorDeOrdenes();
		assertEquals(NotificarPorMail.getInstance().ordenes.size(), 0);
		
		procesador.procesar(new Orden());
		
		assertEquals(NotificarPorMail.getInstance().ordenes.size(), 1);
	}

}
