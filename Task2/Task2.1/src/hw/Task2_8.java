package hw;

import java.util.Scanner;

public class Task2_8 {
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
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}

		}
		System.out.println("\n");
		System.out.println("Максимальный элемент: " + max);
		System.out.println("Минимальный элемент: " + min);
	}
}
