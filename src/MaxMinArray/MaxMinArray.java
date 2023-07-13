package MaxMinArray;

import java.util.Scanner;

public class MaxMinArray {
	
	public static int MinMax(int arr[],int size)
	{
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return max+min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}		
		int size = arr.length;
		int result = MinMax(arr,size);
		System.out.println(result);

	}

}
