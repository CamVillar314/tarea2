import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Polinomios{


	public static int[] suma(int[] a, int[] b, int c){
		
		int[] sumaArrays = new int[c];
		for (int k = 0; k < c ; ++k) {
			
			sumaArrays[k] += a[k] + b[k];
		}
		return sumaArrays;
	}

	public static int[] producto(int[] c, int[] d, int e){
		
		int[] productoArrays = new int[2*e-2];
		for (int l = 0; l < e; ++l){
			for (int m = 0; m < e; ++m){
				
				productoArrays[l + m] = c[l] * b[m];
			}
			
		}
		return productoArrays;

	}
	
	public static int[] d(int[] polin1, int[] polin2, int f){
	
		
	}
	
	

	public static void main(String[] args) {


		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int[] pol1 = new int[n+1];
		int[] pol2 = new int[n+1];

		for (int i = 0; i < n+1 ; ++i) {

			Scanner a1 = new Scanner(System.in);
			int a = a1.nextInt();
			pol1[i] = a;

		}

		for (int j = 0 ; j < n+1 ; ++j) {

			Scanner b1 = new Scanner(System.in);
			int b = b1.nextInt();
			pol2[j] = b;
		}
		
		int[] aprim = new int[(n+1)/2];
		int [] a2prim = new int[(n+1)/2];
		int[] bprim = new int[(n+1)/2];
		int[] b2prim = new int[(n+1)/2];
		for (int i = 0; i < (n+1)/2; ++i){
			
			aprim[i] = poli1[i];
			bprim[i] = poli2[i];
		}
		for(int j = (n+1)/2; j < (n+1); ++j){
		
			a2prim[j] = poli1[j];
			b2prim[j] = poli2[j];
		}



		
	}
}
