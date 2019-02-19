package hw;

import java.util.Scanner;

public class Task2_11 {
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
		
		double[] newArray = new double[arrayLength];
		newArray[0] = array[0];
		newArray[arrayLength - 1] = array[arrayLength - 1];
		
		for (int i = 1; i < array.length - 1; i++) {
			newArray[i] = ((double) (array[i - 1] + array[i + 1])) / 2;
		}

		System.out.println();
		System.out.println("Ёлементы нового массива:");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]);
			System.out.print(" ");
		}

	}
}
