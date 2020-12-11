package app;

public class Fila {
	private String[]vetor;
	private int tamanho;
	private int incio;
	private int fim;

	public Fila() {}

	public Fila(int tamanho) {
		this.vetor = new String[tamanho];
	}

	public String[] getVetor() {
		return vetor;
	}

	public void setVetor(String[] vetor) {
		this.vetor = vetor;
	}

	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getIncio() {
		return incio;
	}

	public void setIncio(int incio) {
		this.incio = incio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public boolean isEmpty() {
		if(vetor[0] == null)
			return true;
		return false;
	}

	public boolean haveSpace() {
		if(vetor.length != getTamanho())
			return true;
		return false;
	}
	public String retornarElemento(int indice) {
		if(indice < vetor.length) {
			return this.vetor[indice];
		}
		return null;
	}
	public void addFila(String elemento) {
		try {
			if(!elemento.isBlank()) {
				if(haveSpace()) {
					vetor[tamanho] = elemento;
					this.tamanho = tamanho + 1;
				}else {
					System.out.println("FILA ESTÁ CHEIA!");
				}
			}else {
				System.out.println("Não é permitodo somente espaço...digite pelo menos um caractere jovem!");
			}
		}catch (NullPointerException e) {
			System.out.println("Elemento nulo não pode ser adicionando.");
		}
	}
	public String imprimir() {
		String acresc="";
		for (String vet : vetor) {
			if(vet != null)
				acresc += vet;
		}
		return acresc;
	}
	public void retirarLista() {
		/*[a][b][c][d]
		 * [b][c][d]*/
		int i = 0;
		if(!isEmpty()) {
			for (i = 0; i < getTamanho(); i++) {
				if(i+1 != getTamanho()) {
					/*i=0[a]     i+1=1[b]*/
					vetor[i] = vetor[i+1];
				}
			}
			vetor[i-1] = null;
			this.tamanho = tamanho-1;
			System.out.println(imprimir());
		}else {
			System.out.println("Não há elementos na fila");
		}
	}
}
