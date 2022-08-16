package com.epam.tasks.lesson5;

import java.util.Scanner;
import java.util.Random;

public class Task31
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
				matrix[i][j] = rand.nextInt(1000);
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
			for(int j = 0; j < n; j++)
			{
				if(matrix[i][j] > 9 && matrix[i][j] < 100)
				{
					count++;
				}
			}
		}
		
		System.out.println("Number of two-digit numbers is " + count);
	}
}
