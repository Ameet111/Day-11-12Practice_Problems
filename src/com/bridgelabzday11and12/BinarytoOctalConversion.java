package com.bridgelabzday11and12;

public class BinarytoOctalConversion {
	
	 public static void main(String args[]){  
			
			String number = "111000";
			int bnum = Integer.parseInt(number, 2);
			String ostr = Integer.toOctalString(bnum);
			System.out.println("Octal Value after conversion is: "+ostr);
		   }

}
