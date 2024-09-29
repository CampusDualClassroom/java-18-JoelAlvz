package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {



	public static int[] createAndInitializeArray(int num){
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {

				array[i] = i + 1;

		}
		return array;
	}

	public static void showInlineArray(int[] array){

		for (int i = 0; i < array.length; i++) {
			if(i == array.length - 1){
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + " ");
			}
		}


	}
	public static void main(String[] args) {

		int n = Utils.integer("Introduce el tamaño del array (números naturales): ");

		while (n <= 0) {
			System.out.println("El tamaño del array debe ser un número entero positivo.");
			n = Utils.integer("Introduce el tamaño del array: ");
		}
		int[] array = createAndInitializeArray(n);


		showInlineArray(array);

	}
}
