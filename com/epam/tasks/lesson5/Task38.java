package com.epam.tasks.lesson5;

import java.util.Scanner;
import java.util.Random;

public class Task38
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		
		for (int i = 0 ; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = rand.nextInt(100);
				b[i][j] = rand.nextInt(100);
			}
		}
		
		showMatrix(a);
		System.out.println("\n     +\n");
		showMatrix(b);
		
		for (int i = 0 ; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] += b[i][j];
			}
		}
		
		System.out.println("\n     ||\n ");
		showMatrix(a);
	}
	
	public static void showMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{ 			
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.printf("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}

