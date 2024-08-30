package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int inputRange=20;
		//Declare sum as Array where fibonacci series are stored in each position
				int[] FibonacciSeries=new int[inputRange];

		//Assigning the default first two numbers of fibonacci series to Array
		FibonacciSeries[0]=0;
		FibonacciSeries[1]=1;

		//Using for loop to find the sum of previous two position and store in Array
		for(int i=2;i<inputRange;i++)
		{
			FibonacciSeries[i]=FibonacciSeries[i-1]+FibonacciSeries[i-2];
		}
		//Printing the values stored in Fibonacci Series
		for(int j=0;j<inputRange;j++)
		System.out.print(FibonacciSeries[j]+" ");
	}

}
