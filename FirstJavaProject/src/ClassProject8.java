
public class ClassProject8 {

	public static void main(String[] args) {
		// Multidimensional Array
		
		int[][] array = {{11, 22, 33},{44, 55, 66}};
		
		int[][] array_2 = new int[2][3];
		array_2[0][0] = 10;
		array_2[0][1] = 20;
		array_2[0][2] = 30;
		array_2[1][0] = 40;
		array_2[1][1] = 50;
		array_2[1][2] = 60;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(array_2[i][j]);
			}
		}

	}

}
