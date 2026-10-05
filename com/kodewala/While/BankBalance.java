
  package com.kodewala.While;
  
  class BankBalance
  {
   public static void main(String[] args)
  {
    int balance = 10000;
    int withdrawal = 2000;
	
	
	
	while(balance >= withdrawal)
	{
	  balance = balance - withdrawal;
	  System.out.println("Withdrawn: " + withdrawal);
	   System.out.println("Remaining balance: " + balance);
	}
     	 
	
  }
  }