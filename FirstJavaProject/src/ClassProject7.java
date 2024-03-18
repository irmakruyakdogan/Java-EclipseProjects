import java.util.Scanner;

public class ClassProject7 {
	
	public static void main_2(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println("Result: " + (double)total / array.length);
	}

	public static void main(String[] args) {
		// Arrays
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = {10, 20, 30, 40};
		
		int[] array_2 = new int[5];
		
		array_2[0] = 1;
		array_2[1] = 2;
		array_2[2] = 3;
		array_2[3] = 4;
		array_2[4] = 5;
		
		//System.out.println("1. eleman: " + array_2[0]);
		//System.out.println("2. eleman: " + array[0]);
		
		/*for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		*/
		System.out.println("Enter Array_2 values:");
		for (int i = 0; i < array_2.length; i++) {
			array_2[i] = scan.nextInt();
		}
		
		/*System.out.println("Array_2 values:");
		
		for (int i = 0; i < array_2.length; i++) {
			System.out.println(array_2[i]);
		}
		*/
		main_2(array_2);


	}

}
