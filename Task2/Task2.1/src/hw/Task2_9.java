package hw;

import java.util.Scanner;

public class Task2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ������ ������� :");
		int arrayLength = scanner.nextInt();
		scanner.close();

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);

		}

		System.out.println();
		System.out.println("�������� �������:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		int min = array[0];
		int max = array[0];
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
				maxIndex = i;
			}

			if (min > array[i]) {
				min = array[i];
				minIndex = i;
			}

		}
		System.out.println("\n");
		System.out.println("������ �������������� ��������: " + maxIndex);
		System.out.println("������ ������������ ��������: " + minIndex);

	}
}
