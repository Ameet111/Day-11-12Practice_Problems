package com.bridgelabzday11and12;

public class OctaltoDecimalConversion {
	
	public static void main(String args[])
    {
        // octal value
        String onum = "137";
  
        // octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(onum, 8);
  
        System.out.println(
            "Decimal equivalent of Octal value 137 is: "
            + num);
    }

}
