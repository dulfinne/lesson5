package com.epam.tasks.lesson5;

import java.util.Scanner;
import java.util.Random;

public class Task28
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
				matrix[i][j] = rand.nextInt(50);
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
		
		int[] arr = new int[n];
		int max = 0;
		int imax = 0;
		
		for (int i = 0 ; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				arr[i] += matrix[j][i];
			}
			
			if(arr[i] > max)
			{
				max = arr[i];
				imax = i;
			}
		}
		
		System.out.println("-----------------------");
		for(int el : arr)
		{
			System.out.printf("%3d ", el);
		}
		
		System.out.println("\nColumn " + imax + " contains the maximum sum");
	}
}
