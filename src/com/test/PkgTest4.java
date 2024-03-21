package com.test;

public class PkgTest4 {

	   public static void main(String args[]) 
	   {       
		   public class FirstNonReapeatedCharacter {

				public static void main(String[] args) {
					Scanner s = new Scanner(System.in);
					System.out.println("Enter the string :");
					String str = s.nextLine();
					for (int i=0;i<str.length();i++) {
						int count=0;
						for(int j=i+1;j<str.length();j++) {
							if(str.charAt(i)==str.charAt(j)) {
								break;
							}else {
								count+=1;
							}
						}
						if(count==str.length()-1-i) {
							System.out.println(str.charAt(i));
							break;
						}
					}
	   } 

}
