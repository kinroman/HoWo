package hw;

import java.util.Scanner;

public class Task2_7 {
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
		
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		
		System.out.println();
		System.out.println("Ёлементы измененного массива:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}
}
