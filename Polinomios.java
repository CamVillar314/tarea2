import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Polinomios{


	public static int[] suma(int[] a, int[] b, int c){
		
		int[] sumaArrays = new int[c];
		for (int k = 0; k < c ; ++k) {
			
			sumaArrays[k] = a[k] + b[k];
		}
		return sumaArrays;
	}

	public static int[] resta(int[] a, int[] b, int c){

		int[] restaArrays = new int[c];
		for (int k = 0; k < c; ++k) {
			
			restaArrays[k] = a[k] + b[k];
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
	
	public static int[] resultado(int[] polin1, int[] polin2, int[] polin3, int[] polin4, int g){


		//Primero se calcula el polinomio d
		int[] d1 = new int[g];
		d1 = suma(polin1,polin2,g);
		int[] d2 = new int[g];
		d2 = suma(polin3,polin4,g);
		int[] d = new int[2*g-2];
		d = producto(d1,d2,g);

		//Calcula el polinomio e
		int[] e = new int[2*g-2];
		e = producto(polin1,polin3,g);

		//Calcula el polinomio f
		int[] f = new int[2*g-2];
		f = producto(polin2,polin4,g);

		//Calcula el polinomio resultante
		int[] c = new int[4*g];
		for (i = 0; i < 2*g-2; ++i) {
			
			c[i] = e[i];
		}
		for (j = 2*g-2; ; ) {
			
		}



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
		int ble = (n+1)/2;

		int[] aprim = new int[ble];
		int [] a2prim = new int[ble];
		int[] bprim = new int[ble];
		int[] b2prim = new int[ble];
		for (int i = 0; i < ble; ++i){
			
			aprim[i] = pol1[i];
			bprim[i] = pol2[i];
		}
		for(int j = ble; j < (n+1); ++j){
		
			a2prim[j] = pol1[j];
			b2prim[j] = pol2[j];
		}


		System.out.println(resultado(aprim,a2prim,bprim,b2prim,ble));
		
	}
}
