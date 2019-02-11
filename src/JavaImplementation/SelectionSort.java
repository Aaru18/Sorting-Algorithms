package JavaImplementation;


import java.util.*;
import java.io.*;
public class SelectionSort {
	
	public static ArrayList<Integer> Sort(ArrayList<Integer> array)
	{
		int size = array.size();
		int min_index = 0;
		for(int i=0;i<size-1;i++)
		{
			min_index = i;
			for(int j=i+1;j<size;j++)
			{
				if(array.get(j) < array.get(min_index))
				{
					min_index = j;
				}
			}
			
			int swap = array.get(min_index);
			array.set(min_index, array.get(i));
			array.set(i, swap);
			
		}
		
		return array;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		String[] split = input.split(" ");
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i =0;i<split.length;i++)
		{
			array.add(Integer.valueOf(split[i]));
		}
		
		array = Sort(array);
		System.out.print(array);
		sc.close();
	}

}
