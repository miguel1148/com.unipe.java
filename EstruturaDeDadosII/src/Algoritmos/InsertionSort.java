package Algoritmos;

public class InsertionSort implements OrdenacaoIA{
	
	
	private void insertionSort(int[] v) {
		for(int i = 0; i < v.length; i ++) {
			int a = v[i];
			for(int j = i -1; j>= 0 && v[j] > a; j--) {
				v[ j + 1] = v[j];
				v[j] = a;
				
			}
		}
	}

	@Override
	public double ordenarVetor(int[] vetor) {
		
		int[] vetorAux = vetor.clone();
		
		long tempoInicial = System.currentTimeMillis();
		insertionSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao =  ( ( tempoFinal - tempoInicial ) / 1000.0 );
		return tempoExecucao;
		
		
	}
	

}
