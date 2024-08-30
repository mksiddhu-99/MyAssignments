package week1.day2;

public class LearnArrayLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// datatype []--> represent array variableName = {value with ,(comma) separation }
				long[] phno = {8925411174L,8925411175L, 8925411171L,8925411173L,8925411180L,8925411172L, 9876543210L};
				System.out.println(phno);// When array variable is printed , it will print the memory location
				
				// Get a particular value from an array by using index
				// Index of the Array starts from zero
				// To get particular value from an array --> variable[index]
				System.out.println(phno[0]);
				System.out.println(phno[4]);
				System.out.println(phno[5]);
				phno[5] = 8925411170L;
				System.out.println(phno[5]);
				//Get the length of an Array
				int length = phno.length;
				System.out.println(length);
				
				for(int i=0;i<length;i++) {
					System.out.println(phno[i]);
	}
	}
}
