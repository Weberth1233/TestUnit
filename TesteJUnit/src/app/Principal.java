package app;

public class Principal {
	public static void main(String[] args) {
		Fila fila = new Fila(5);
		String v = "";
		fila.addFila("A");
		fila.addFila("B");
		fila.addFila("D");
		fila.addFila("J");
		fila.addFila("I");
		
		String retorno = fila.retornarElemento(0);
		System.out.println("Retorno: "+retorno);
		
		v = fila.imprimir();
		System.out.println(v);
		
		fila.retirarLista();
		fila.retirarLista();
		fila.retirarLista();
		fila.retirarLista();
		fila.retirarLista();
		fila.retirarLista();
		
		boolean validacao = fila.isEmpty();
		System.out.println("Está vazia? "+validacao);
	}
}
