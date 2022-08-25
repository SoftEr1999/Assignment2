
public class StringSortingAccordingToLength {
	
	/*
	 * Question:- Arrange String in length wise ascending order 
	 * Ex:-  This is a easiest example
	 * O/p:- a is This easiest example
	 */

	public static void main(String[] args) {
		
		// Declaring and Initializing a string
		 String str = "This is a easiest example";
		  
		 // Splitting the string using predefined string function
		 
		  String[] str1=str.split(" ");   // splitting with de-limitation of space 
		  
		  //Logic to sorting the string into ascending order according to length
		  
		  for(int i=0;i<str1.length;i++) //for loop
		  	{ 
		  for(int j=i+1;j<str1.length;j++) 
		  		{ 
		  if(str1[i].length()>str1[j].length()) // comparing length of split  string
		  			{ 
		  String temp= str1[i]; 
		  str1[i]=str1[j]; 							// assigning their position
		  str1[j]=temp; 
		  			} 
		  		} 
		  } 
		  //End of logic
		  
		  // Printing the string after sorting
		  for(int i=0;i<str1.length;i++) 
		  	{ 
			  System.out.print(str1[i]+" ");  
		  	} 
		  
		  
	} 
		

	}


