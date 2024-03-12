package com.test;

public class PkgTest4 {

	   public static void main(String args[]) 
	   {       
//			Date today=new Date();
//			System.out.println(":today:"+today);  
			
			java.util.Date utilDate=new java.util.Date();
			java.sql.Date sqlDate=new java.sql.Date(0);
			
			System.out.println(":utilDate:"+utilDate); 
			System.out.println(":sqlDate:"+sqlDate);  
	   } 

}
