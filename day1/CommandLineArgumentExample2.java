package com.celcom.day1;

public class CommandLineArgumentExample2 {
	public static void main(String args[]) {
		if(args.length == 2) {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			System.out.print("Addition = " + (n1 + n2));
		}
		else {
			System.out.print("Insufficient Arguments!!");
		}
	}

}
