package Prueba13Abril;

import java.util.Scanner;

public class Prueba13Abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		double a[], b[], v[], prod, suma = 0, mod, mod1 = 0, mod2 = 0, z, moda, modb;
		int n, num;
		
		System.out.println("¿Cuantos Valores va a Ingresar?");
		n = tc.nextInt();
		v = new double [(int)n];
		a = new double [n];
		b = new double [n];
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("Ingrese Valor del Arreglo A #" +(i+1));
			num = tc.nextInt();
			a[i] = num;
		}
		for(int i = 0; i < v.length; i++) {
			System.out.println("Ingrese Valor del Arreglo B #" +(i+1));
			num = tc.nextInt();
			b[i] = num;
		}
		for(int i = 0; i < v.length; i++) {
			prod = (a[i]*b[i]);
			suma = suma + prod;
			mod1 += Math.pow(a[i], 2);
			mod2 += Math.pow(b[i], 2);
		}
		System.out.println("El Producto Punto de Ambos Arreglos es: " +suma);
		
		moda = (double) Math.sqrt(mod1);
		modb = (double) Math.sqrt(mod2);
		mod = moda * modb;
		z = suma / mod;
		System.out.println("La Expresion Z es Igual a: " +z);

	}
}