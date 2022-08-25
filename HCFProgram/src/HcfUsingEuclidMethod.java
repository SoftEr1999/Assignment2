
public class HcfUsingEuclidMethod {
	
	/*
	 * Question:- Find HCF of two number, the numbers are 60,36 
	 * (Using Euclid formula)
	 */

	public static void main(String[] args) 
	{
		
		int num1 = 60;  // First number
		int num2 = 36;  // Second Number
		
		//Printing the HCF of two numbers
		System.out.println("The HCF of 60 and 36 is: " + findHCF(num1,num2));  //Calling findHCF method
	}  
	
	
	// Declaring and defining of method to solve HCF of two numbers
	
		static int findHCF(int x, int y)  // method start
		{  
			// Applying Euclidian formula to find HCF of two numbers
		int r=0, a, b; 
		
		//Conditional operator to find greater and smaller number
		
		a = (x > y) ? x : y; // a is greater number  
		b = (x < y) ? x : y; // b is smaller number  
		r = b;  
		while(a % b != 0)  
		{  
		r = a % b;  
		a = b;  
		b = r;  
		}  
		return r;  

	}

}
