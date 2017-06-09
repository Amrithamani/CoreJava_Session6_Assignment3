package session6;

import java.util.Scanner;

public class SearchArrayElements {

	// initializing integer variable indices

	static int indices;

	// declaring sorting array method to sort arrays

	public int[] sortingArray(int[] array) {

		// initializing integer local variable

		int swap;

		// loops to sort arrays

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {

				// checking whether current indices value greater than next
				// indices value

				if (array[j] > array[j + 1]) {

					// swapping both indices value

					swap = array[j];

					array[j] = array[j + 1];

					array[j + 1] = swap;

				}

			}

		}

		return array;// returns array indices value

	}

	// declaring binary search method to search given number

	public boolean binarySearch(int[] array, int number) {

		// initializing integer local variable

		int middleElement = array.length / 2 - 1;

		// checking number value equals to indices value

		if (number == array[middleElement]) {

			indices = middleElement;// assigning index value to indices

			return true;

		}

		// checking number value greater than indices value

		else if (number > array[middleElement]) {

			for (int i = middleElement + 1; i < array.length; i++) {

				// checking number value equals to indices value

				if (number == array[i]) {

					indices = i;// assigning index value to indices

					return true;

				}
			}
		}

		// checking number value less than indices value

		else if (number < array[middleElement]) {

			for (int i = middleElement - 1; i >= 0; i--) {

				// checking number value equals to indices value

				if (number == array[i]) {

					indices = i;// assigning index value to indices

					return true;

				}

			}

		}

		return false;

	}

	public static void main(String[] args) {

		// creating object for SearchArrayElements class

		SearchArrayElements obj = new SearchArrayElements();

		// initializing integer array with inputs

		int[] input = new int[10];

		// creating object for Scanner class

		Scanner s = new Scanner(System.in);

		System.out.println("Enter ten numbers");
		// prints Enter ten numbers

		// loop to get user inputs

		for (int i = 0; i < input.length; i++) {

			input[i] = s.nextInt();
			// scanner object to call user input

		}

		// sorting array element

		input = obj.sortingArray(input);

		//

		System.out.println("Sorted elements in an array:");
		// prints Sorted elements in an array:

		// loop to print array elements

		for (int i = 0; i < input.length; i++) {

			System.out.println(input[i]);
			// prints array value

		}

		System.out.println("Enter number to search");
		// prints Enter number to search

		int number = s.nextInt();
		// scanner object to call user input

		s.close();
		// closing scanner object

		// checking numbers using binary search algorithm

		if (obj.binarySearch(input, number) == true) {

			System.out.println("Element Found");
			System.out.println("Index position of the Element is " + indices);
			// prints Element Found
			// Index position of the Element

		} else {

			System.out.println("Element not Found");
			// prints Element not Found

		}
	}

}
