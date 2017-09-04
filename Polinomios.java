import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Polinomios2{

	public static int[] suma(int[] a, int[] b, int c){
		
		int[] sumaArrays = new int[c];
		for (int k = 0; k < c ; ++k) {
			
			sumaArrays[k] = a[k] + b[k];
		}
		return sumaArrays;
	}

	public static int[] resta(int[] a, int[] b, int[] z, int c){

		int[] restaArrays = new int[c];
		for (int k = 0; k < c; ++k) {
			
			restaArrays[k] = a[k] - b[k] - z[k];
		}
		return restaArrays;
	}

	public static int[] producto(int[] c, int[] d, int e){
		
		int[] productoArrays = new int[2*e-2];
		for (int l = 0; l < e; ++l){
			for (int m = 0; m < e; ++m){
				
				productoArrays[l + m] = c[l] * d[m];
			}
			
		}
		return productoArrays;

	}


	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int tamArr;
		if ((n+1)%2 == 0) {
			
			tamArr = n+1;			

		}
		else {
			tamArr = n+2;
		}

		int[] pol1 = new int[tamArr];
		int[] pol2 = new int[tamArr];

		for (int i = 0; i < tamArr ; ++i) {

			
			Scanner a1 = new Scanner(System.in);
			int a = a1.nextInt();
			pol1[i] = a;

			Scanner b1 = new Scanner(System.in);
			int b = b1.nextInt();
			pol2[i] = b;

		}

		int tamSub = tamArr/2;

		int[] aprim = new int[tamArr];
		int [] a2prim = new int[tamArr];
		int[] bprim = new int[tamArr];
		int[] b2prim = new int[tamArr];
		for (int i = 0; i < tamArr; ++i){
			
			aprim[i] = pol1[i];
			bprim[i] = pol2[i];
		}
		for(int j = tamArr; j < (n+1); ++j){
		
			a2prim[j] = pol1[j];
			b2prim[j] = pol2[j];
		}


	}
}
