package com.gratsit.arrays;

public class ArraysDemo7 {

	public static void main(String[] args) {		
		String[] companyArr=new String[3];
		companyArr[0]="GratsIT";
		companyArr[1]="Wipro";
		companyArr[2]="Infosys";
		for(int i=0;i<companyArr.length;i++){
			System.out.println(":"+companyArr[i]);
		}
		companyArr[3]="Accenture";
		System.out.println(":"+companyArr[5]);
	}

}
