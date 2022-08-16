package com.epam.tasks.lesson5;

import java.util.Scanner;

public class Task25
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0 ; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				matrix[i][j] = i * n + j + 1;
			}
		}
		
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
