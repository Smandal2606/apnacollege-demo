
   package com.kodewala.While;
     class  LoginSystem
	 {
	  public static void main(String[] args)
	 {
	   String correctPassword = "java123";
       String password = "hello";
       int attempts = 1;
	   
	   while(correctPassword != password && attempts <= 3)
	   {
	   attempts++;
	    System.out.println("Login successful");
	   }
	   if(attempts > 3){
	   System.out.println("Account locked");
	   }
	 }
	 }