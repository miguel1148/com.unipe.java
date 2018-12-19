package OrdenaAlgoritmo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import Algoritmos.BubbleSort;
import Algoritmos.InsertionSort;
import Algoritmos.MergeSort;
import Algoritmos.QuickSort;
import Algoritmos.SelectionSort;



public class Main {
	
	public static void main(String[] args) {
		
	
		int limiteSuperior = 100000;
		int totalExecucoes = 30;
		
//		algoritmosOrdenacao.add(Algoritmos.bubbleSort(v));
		List<Integer> tamanhoVetores = new ArrayList<Integer>();
		tamanhoVetores.add( 100 );
		tamanhoVetores.add( 1000 );
		tamanhoVetores.add( 5000 );
		tamanhoVetores.add( 10000 );
		tamanhoVetores.add( 50000 );

		
		System.out.println( "\n\n Iniciando Experimento" );
		
//		HashMap<String, Double> mapTempoExecucoes =  new HashMap<String, Double>();
		
		
		SelectionSort select = new SelectionSort();
		InsertionSort insert = new InsertionSort();
		BubbleSort bubbles = new BubbleSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		for(int tamanhoVetor: tamanhoVetores) {

			System.out.println( "\n    Tamanho Vetor: " + tamanhoVetor + "\n" );
			ArrayList<Double> vetorAux  = new ArrayList<Double>();
			
			for(int i = 1; i <= 30; i++) {
      
				int[] vetor = Utils.gerarVetor( tamanhoVetor, limiteSuperior );
		   
				
	
				vetorAux.add(bubbles.ordenarVetor(vetor));
				vetorAux.add(quick.ordenarVetor(vetor));
				vetorAux.add(merge.ordenarVetor(vetor));
				vetorAux.add(insert.ordenarVetor(vetor));
				vetorAux.add(select.ordenarVetor(vetor));

            	} // FOR ALGORITMOS ORDENAÇÃO
			
			double somaDaArray = 0, quickSoma = 0, insertSoma = 0, selectSoma = 0, bubbleSoma = 0;
			
			for(int i = 0; i < totalExecucoes; i++){
//				System.out.println("Merge "+vetorAux.get(i));
				somaDaArray += vetorAux.get(i);
			}
			for(int i = 30; i < 59; i++){
//				System.out.println("quick "+vetorAux.get(i));
				quickSoma += vetorAux.get(i);
			}
			for(int i = 60; i < 89; i++){
				//	System.out.println("quick "+vetorAux.get(i));
					insertSoma += vetorAux.get(i);
				}
	       
			for(int i = 90; i < 119; i++){
				//	System.out.println("quick "+vetorAux.get(i));
					selectSoma += vetorAux.get(i);
				}
			for(int i = 120; i < 149; i++){
				//	System.out.println("quick "+vetorAux.get(i));
					bubbleSoma += vetorAux.get(i);
				}
			
			
			
			System.out.println("Media Mergesorte:\t "+somaDaArray/30 + "\nMedia QuickSort:\t " + quickSoma/30
					+"\nMedia InsertionSort:\t "+ insertSoma + "\nMedia SelectionSort:\t "+ selectSoma
					+"\nMediaBubbleSort:\t "+bubbleSoma);
			
			
      } // FOR TOTAL EXECUÇÕES

		
		
		
		
	}
}
