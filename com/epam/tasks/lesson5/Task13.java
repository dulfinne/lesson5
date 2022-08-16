package com.epam.tasks.lesson5;

import java.util.Scanner;

public class Task13
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
				if(i % 2 == 0)
				{
					matrix[i][j] = j + 1;
				}
				else
				{
					matrix[i][j] = n - j;
				}					
			}
		}
		
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
