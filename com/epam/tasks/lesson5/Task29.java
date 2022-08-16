package com.epam.tasks.lesson5;

import java.util.Scanner;
import java.util.Random;

public class Task29
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0 ; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				matrix[i][j] = rand.nextInt(100) - 50;
			}
		}
		
		for (int i = 0; i < matrix.length; i++)
		{ 			
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.printf("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
		
		int count = 0;
		for (int i = 0 ; i < n; i++)
		{
			if (matrix[i][i] > 0)
			{
				count++;
			}
		}
		
		int[] pos = new int[count];
		
		for (int i = 0, j = 0; i < matrix.length; i++)
		{
			if (matrix[i][i] > 0)
			{
				pos[j++] = matrix[i][i];
			}
		}
		
		System.out.println("Positive elements of the main diagonal are: ");
		for(int el : pos)
		{
			System.out.print(el + " ");
		}
	}
}
