package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5623;
		//Assigning a boolean variable
		
		boolean isPrime=true;
		//Making false the 0 and 1 input
		
		if(input==0 && input==1)
			isPrime=false;
		//Checking reminder for the input number with iterative integers from 2
		
		for(int i=2;i<input-1;i++)
		{
		if(input%i==0)
		{
			isPrime=false;
		    break;
		}
		}
		if(isPrime==false)
		System.out.println(input+" is not a prime number");
		else
			System.out.println(input+" is a prime number");
	}

}
