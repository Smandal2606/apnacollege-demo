
  package com.kodewala.While;
  
  class ShoppingCart
  {
   public static void main(String[] args)
  {
    int[] prices = {500, 1200, 300, 800, 1500};
	
	int i = 0;
	 int total = 0;
	 
	while(i < prices.length)
	{
		total = total + prices[i];
	  i++;
	}
	  System.out.println("Total is: " + total);
	
  }
  }
  
  