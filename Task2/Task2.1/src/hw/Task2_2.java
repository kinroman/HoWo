package hw;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ввдите размер массива :");
		int arrayLength = scanner.nextInt();
		scanner.close();
		long product = 1;
                   
		int[] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			product *= array[i];//
		}
		
		System.out.println();
		System.out.println("Элементы массива:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		System.out.println("Произведение всех элементов массива:");
		System.out.println(product);

	}
}
