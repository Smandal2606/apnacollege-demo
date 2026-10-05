
   package com.kodewala.dowhile;
   
   class CalculateSum
   {
    public static void main(String[] args)
   {
   int number = 1;
   int sum = 0;
   do{
   sum = sum + number;
   number++;
   System.out.println("Sum is: " + sum);
   } while(number <= 10);
   }
   }