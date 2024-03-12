package com.gratsit.arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks={55,65,75,85};
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		marks[1]=77;
		marks[3]=99;
		System.out.println(":Array updated:");
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
	}

}
