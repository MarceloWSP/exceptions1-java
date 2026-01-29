package matrizes.ExResolvido;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i=0;i<mat.length; i++) {
			for(int j=0;j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main Diagonal: ");
		for (int i = 0;i<mat.length;i++) {
			System.out.print(mat[i][i]+" ");
		}

		int neg = 0;
		for (int[] element : mat) {
			for(int j=0;j<element.length; j++) {
				if (element[j] < 0) {
					neg++;
				}
			}
		}
		System.out.println("Negative numbers = "+neg);


		sc.close();
	}

}
