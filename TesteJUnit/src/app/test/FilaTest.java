package app.test;

import org.junit.Assert;
import org.junit.Test;

import app.Fila;

public class FilaTest {

	@Test
	public void testIsEmpty() {
		boolean b;
		Fila filaA = new Fila(1);
		filaA.addFila("A");
		b = filaA.isEmpty();
		Assert.assertFalse(b);
		
		Fila filaB = new Fila(1);
		filaB.addFila(" ");
		b = filaB.isEmpty();
		Assert.assertTrue(b);
		
		Fila filaC = new Fila(1);
		filaC.addFila(null);
		b = filaC.isEmpty();
		Assert.assertTrue(b);
	}
	
	@Test
	public void testHaveSpace() {
		boolean b;
		Fila filaA = new Fila(2);
		filaA.addFila("Q");
		filaA.addFila("W");
		filaA.addFila("U");
		b = filaA.haveSpace();
		Assert.assertFalse(b);
		
		Fila filaB = new Fila(2);
		filaA.addFila("Q");
		b = filaB.haveSpace();
		Assert.assertTrue(b);
		
		Fila filaC= new Fila(2);
		filaC.addFila(" ");
		filaC.addFila(" ");
		filaC.addFila(" ");
		
		b = filaC.haveSpace();
		Assert.assertTrue(b);
		
		b = filaC.isEmpty();
		Assert.assertTrue(b);
		
		Fila filaD = new Fila(2);
		filaD.addFila(" ");
		filaD.addFila("F");
		filaD.addFila(" ");
		
		b = filaD.isEmpty();
		Assert.assertFalse(b);
	}
	
	@Test
	public void testRetornaElemento() {
		String v;
		Fila filaA = new Fila(2);
		filaA.addFila(" ");
		filaA.addFila("F");
		
		v = filaA.retornarElemento(0);
		Assert.assertEquals("F", v);
		
		Fila filaB = new Fila(3);
		filaB.addFila("A");
		filaB.addFila("C");
		filaB.addFila("F");
		
		v = filaB.retornarElemento(1);
		Assert.assertEquals("C", v);
		
		v = filaB.retornarElemento(4);
		Assert.assertEquals(null, v);
	}
	@Test
	public void retirarLista() {
		String v;
		Fila filaA = new Fila(4);
		filaA.addFila("A");
		filaA.addFila("C");
		filaA.addFila("F");
		filaA.addFila("D");
		v = filaA.imprimir();
		Assert.assertEquals("ACFD", v);
		
		filaA.retirarLista();
		v = filaA.imprimir();
		Assert.assertEquals("CFD", v);
		Assert.assertNotEquals("ACFDE", v);
		
		filaA.retirarLista();
		filaA.retirarLista();
		filaA.retirarLista();
		v = filaA.imprimir();
		Assert.assertEquals("",v);
	}
}
