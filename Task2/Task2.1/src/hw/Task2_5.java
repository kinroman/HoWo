package hw;

import java.util.Scanner;

public class Task2_5 {
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
		System.out.println("\n");
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.println("Номер нулевого элемента: " + i);
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Нулевых элементов нет !");
		} 

	}
}
