package Algoritmos;

public class SelectionSort implements OrdenacaoIA{

	public static void selectionSort(int[] v, int v_size) {
		int i, j;
		int min, temp;
		for(i  = 0; i < v_size - 1; i++ ) {
			min = i;
			for(j = i + 1; j < v_size; j++) {
				if(v[j] < v[min]) 
					min = j;
			}
			temp = v[i];
			v[i] = v[min];
			v[min] = temp;
		}
	}

	@Override
	public double ordenarVetor(int[] vetor) {
		// TODO Auto-generated method stub
		int v_size = vetor.length ;
		int[] vetorAux = vetor.clone();
		
		long tempoInicial = System.currentTimeMillis();
		selectionSort(vetor, v_size);
		long tempoFinal = System.currentTimeMillis();
		double tempoExecucao =  ( ( tempoFinal - tempoInicial ) / 1000.0 );
		return tempoExecucao;
		
		
	}

	
}
