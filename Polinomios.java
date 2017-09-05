import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Polinomios{

	


	public static int[] suma(int[] arreglo1, int[] arreglo2, int tamArreglo){
		
		int[] sumaArrays = new int[tamArreglo];
		for (int k = 0; k < tamArreglo ; ++k) {
			
			sumaArrays[k] = arreglo1[k] + arreglo2[k];
		}
		return sumaArrays;
	}

	public static int[] resta(int[] arreglo1, int[] arreglo2, int[] arreglo3, int tamArreglo){

		int[] restaArrays = new int[tamArreglo];
		for (int k = 0; k < tamArreglo; ++k) {
			
			restaArrays[k] = arreglo1[k] - arreglo2[k] - arreglo3[k];
		}
		return restaArrays;
	}

	public static int[] producto(int[] arreglo1, int[] arreglo2, int tamArreglo){
		
		int[] productoArrays = new int[2*tamArreglo-2];
		for (int l = 0; l < tamArreglo; ++l){
			for (int m = 0; m < tamArreglo; ++m){
				
				productoArrays[l + m] = arreglo1[l] * arreglo2[m];
			}
			
		}
		return productoArrays;

	}

	public static int[] resultado(int[] arreglo1, int[] arreglo2, int tamArreglo){

		int[] d = new int[]

	}

	public static void separador(int[] arreglo1, int[] arreglo2, int tamArreglo){

		int nuevoTam;

		if ((tamArreglo+1)%2 == 0) {

			nuevoTam = tamArreglo + 1;

		}

		else {
			
			nuevoTam = tamArreglo;
		}


		int[] nuevoArreglo1 = new int[nuevoTam];
		int[] nuevoArreglo2 = new int[nuevoTam];

		for (int i = 0; i < nuevoTam ; ++i) {

			nuevoArreglo1[i] = arreglo1[i];
			nuevoArreglo2[i] = arreglo2[i];
			
		}

		int tamSub = nuevoTam/2;

		int[] aprim = new int[tamSub];
		int [] a2prim = new int[tamSub];
		int[] bprim = new int[tamSub];
		int[] b2prim = new int[tamSub];
		for (int i = 0; i < tamSub; ++i){
			
			aprim[i] = nuevoArreglo1[i];
			bprim[i] = nuevoArreglo2[i];
		}
		for(int j = tamSub + 1; j < nuevoTam; ++j){
		
			a2prim[j] = nuevoArreglo1[j];
			b2prim[j] = nuevoArreglo2 [j];
		}


	}


	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int tamArr = n+1;
		

		int[] pol1 = new int[tamArr];
		int[] pol2 = new int[tamArr];

		for (int i = 0; i < tamArr ; ++i) {
			
			int a = m.nextInt();
			pol1[i] = a;

			int b = m.nextInt();
			pol2[i] = b;

		}


	}
}
