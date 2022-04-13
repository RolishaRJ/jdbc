package com.jdbctask.main;


import com.jdbctask.impl.ServiceImpl;
import com.jdbctask.service.Service;

public class Main {
	
	 static Service service =null; 

	public static void main(String[] args) {
		service=new ServiceImpl();
		
		//Insert
//		Employee employee =new Employee(1, "Rolisha", 23, 20000, "Poothurai");	
//		service.insert(employee);
//		 employee =new Employee(2, "Lolita", 24, 23000, "Salam");
//		 service.insert(employee);
//		 employee =new Employee(3, "Manju", 26, 10000, "chennai");	
//		 service.insert(employee);
//		 employee =new Employee(4, "linu", 23, 18000, "nagercoil");		
//		service.insert(employee);
		
		//Update
//		service.updateCity(4, "Chennai");
		
		//Delete
//		service.delte(3);
//		
//		//fetch
		service.fetchAllEmployee();
		
		
		
		
	}
   
}
