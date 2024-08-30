package week1.day2;

import java.util.Arrays;

public class FindDuplicate 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		 Arrays.sort(num);
		 //Option 1: using nested for loop
		 for (int i = 0; i < num.length; i++)
		 {
			for (int j = 1; j < num.length; j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
				}
				else
				
					continue;
				
			}
			}
		 }	
	}
	


