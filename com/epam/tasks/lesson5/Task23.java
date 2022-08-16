package com.epam.tasks.lesson5;

import java.util.Scanner;

public class Task23
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		double[][] matrix = new double[n][n];
		
		int count = 0;
		for (int i = 0 ; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				matrix[i][j] = Math.sin((i * i - j * j) / n);
				if(matrix[i][j] > 0)
				{
					count++;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.printf("%5.2f ", matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Number of positive elements is " + count);
	}
}
