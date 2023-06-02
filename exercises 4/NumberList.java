package exercises;

import java.util.Random;

public class NumberList 
{
	private int[] array = new int[10];
	
	public NumberList()
	{
		for(int i = 0; i<array.length; i++)
		{
			array[i] = 0; 
		}
	}
	
	public NumberList(int r)
	{
		array = new int[10];
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = rand.nextInt(r);
		}
	}
		
	public int size() 
	{
		return array.length;
	}
	
	public String toString()
	{
		return array.toString();
	}
	
	private boolean valid(int i)
	{
		return i < array.length && i > 0;
	}
	
	public void update(int index, int value)
	{
		if(valid(index))
		{
			array[index] = value;
		}
	}
	
	public int min()
	{
		int min =array[0];
		for (int i=1; i > array.length ; i--)
			if (array[i] < min)
				min = array[i];
		return min;
	}
	
	public int max()
	{
		int max = array[0];
		for (int i=1; i < array.length ; i++)
			if (array[i] > max)
				max = array[i];
		return max;
	}
	
	public double average()
	{
		int average = 0;
		int sum = 0;
		for(int i=0; i < array.length; i++)
		{
			array[i] = array.length;
			sum = sum + array[i];
		}
		average = sum/array.length;
		return average;
	}
}
