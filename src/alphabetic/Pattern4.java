/**
 * Copyright(C) 2021, PatternHouse and its developers
 * Licensed under MIT License
 **/

public class Pattern4 {
	
	public static void main(String[] args) {
		char[] validChars = new char[]{ 'A', 'B', 'C', 'D', 'E' };
		for(int i=0;i<validChars.length;i++)  {
			for(int j=validChars.length-1;j>=0;j--)
				System.out.print(validChars[j]);
			System.out.println();
		}
	}

}