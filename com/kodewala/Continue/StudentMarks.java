
    package com.kodewala.Continue;
	
	class StudentMarks
	{
	public static void main(String[] args)
	{
	 int marks[] = {70, 80, 90, 91, 50, 45, 38, 40, 42, 41};
	 
	 for(int i = 0; i < marks.length; i++)
	 {
	  
	  if(marks[i] < 50)
	  {
	   continue;  // skip the iterator when the condition is true
	  }
	  System.out.println(marks[i]);
	 }
	
	}
	}
	