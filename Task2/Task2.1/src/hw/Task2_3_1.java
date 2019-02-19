package hw;

import java.util.Scanner;

public class Task2_3_1 {
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
		System.out.println("Элементы массива:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

		for (int i = 2; i < array.length; i += 3) {
			array[i] *= 2;
		}

		System.out.println("\n");
		System.out.println("Каждый третий элемент умножен на 2:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}
}
