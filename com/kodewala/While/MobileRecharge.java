
  package com.kodewala.While;
  
  class MobileRecharge
  {
    public static void main(String[] args)
	{
	 int balance = 1000;
     int rechargeAmount = 199;
	 
	 while(balance >= rechargeAmount)
	 {
	   balance = balance - rechargeAmount;
	   System.out.println("Balance: " + balance);
	   System.out.println("Recharge Amount : " + rechargeAmount);
	 }
	}
  
  }