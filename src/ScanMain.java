

import java.util.Scanner;

public class ScanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while (true) {
		
			String str = new String();
			int halfCompare;
			int length;
			
			Scanner in = new Scanner(System.in);
			
			str = in.nextLine();
			
			str.toLowerCase();
			
			String[] str2 = str.split(" ");
			
			String finalStr = new String();
			String oneStr = new String();
			
			for (int i=0; i< str2.length; i++) {
				finalStr += str2[i];
			}
	
			char[] compare = finalStr.toCharArray();
	
			halfCompare = compare.length / 2;
			length = compare.length;
			
			

			
			for (int i=length-1; i >= 0; i--) {
				oneStr += compare[i];
			}
			
			
			if (finalStr.equalsIgnoreCase(oneStr)) {
				System.out.println("Это палиндром!");
			} else {
				System.out.println("Это не палиндром!");
			}
			
			if (str.equalsIgnoreCase("exit")) {
				break;
			}
			
		}
	
	}
}
