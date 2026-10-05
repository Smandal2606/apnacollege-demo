  
  package com.kodewala.Continue;
  
  class ContinueExample
  {
  public static void main(String[] args)
  {
   String product[] = {"apple16", "samsung", "lg", "nokia", "tata", "apple16", "samsung34", "apple16", "redmi"};
   
   int productCount = 0;
   for(int i = 0; i < product.length; i++)
   {
   String currentProduct = product[i];
   if(currentProduct.startsWith("apple")){
   continue;
   }
   productCount = productCount + 1;
   }
   System.out.println("Total product (Except Apple)" + productCount);
  }
  }