package com.bridgelabzday11and12;

public class HexadecimaltoDecimalConversion {
	
	 public static void main(String args[]) { 
			//given hexadecimal number
			String hexnum = "6F";
				
			//converting hex to decimal by passing base 16 
			int num = Integer.parseInt(hexnum,16);
				
			System.out.println("Decimal equivalent of given hex number: "+num);
			
		   }

}
