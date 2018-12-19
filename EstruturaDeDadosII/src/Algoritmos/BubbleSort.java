package Algoritmos;

public class BubbleSort implements OrdenacaoIA{
	
	private void bubbleSort(int v[]) {
		for(int i = v.length; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				if(v[j - 1] > v[j]) {
					int aux = v[j];
					v[j] = v[j - 1];
					v[j - 1] = aux;
				}
			}
		}
	}

	@Override
	public double ordenarVetor(int[] vetor) {
		
		int[] vetorAux = vetor.clone();
		
		long tempoInicial = System.currentTimeMillis();
		bubbleSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao =  ( ( tempoFinal - tempoInicial ) / 1000.0 );
		return tempoExecucao;
		
	}
	

}
