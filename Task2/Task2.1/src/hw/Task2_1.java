package hw;

import java.util.Scanner;

public class Task2_1 {

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

		System.out.println("Ёлементы массива в пр€мом пор€дке:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		
		System.out.println("Ёлементы массива в обратном пор€дке:");
		for (int i =array.length -1; i >= 0; i--) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println();

	}
}