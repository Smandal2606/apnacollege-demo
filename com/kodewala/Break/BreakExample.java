
  package com.kodewala.Break;
  
  class BreakExample
  {
  public static void main(String[] args)
  {
  String[] cities = {"Mumbai","Delhi","Surat","Bengaluru","Chennai","Kolkata","Pune","Ahmedabad",
    "Jaipur","Hyderabad","Patna","Bhopal","Indore","Ranchi","Hyderabad","Hyderabad","Kanpur",
	"Varanasi","Bhubaneswar", "Chandigarh" }; // 
	
	for(int i = 0; i < cities.length; i++)
	{
	  if(cities[i].equals("Hyderabad")){
	  break;
	}
       System.out.println(cities[i]);
  }
  }
  }