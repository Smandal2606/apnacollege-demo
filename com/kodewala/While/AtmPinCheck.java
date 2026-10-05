
  package com.kodewala.While;
  
  class AtmPinCheck
  {
    public static void main(String[] args)
  {
    int correctPin = 1234;
    int enteredPin = 1111;
    int attempts = 1;
	
	while(enteredPin != correctPin && attempts <= 3)
	{
	  attempts++;
	  System.out.println("INCORRECT PIN");
	}
	if(attempts > 3){
	 System.out.println("Account temporarily blocked");
	}
  
  }
  }