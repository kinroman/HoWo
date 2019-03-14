package hw;

import java.util.Scanner;

public class Task2_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ввдите размер массива :");
		int arrayLength = scanner.nextInt();
		scanner.close();

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);

		}

		System.out.println();
		System.out.println("Ёлементы массива:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		
		if (array.length > 2) {
			int last = array[array.length - 1];
			int penult = array[array.length - 2];
			for (int i = array.length - 1; i > 1; i--) {
				array[i] = array[i - 2];
			}
			array[0] = penult;
			array[1] = last;
		}
		
		System.out.println();
		System.out.println("Ёлементы нового массива:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		

	}
}
