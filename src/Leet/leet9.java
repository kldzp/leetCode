package Leet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class leet9 {
	
	public static void main(String[] args) {
		int input = -121;
		String s = Integer.toString(input);
		int length = s.length();
		char[] ch = s.toCharArray();
		for (int i=0; i<length; i++) {
			if (ch[i] != ch[length-1-i]) {
				System.out.println("false");
			}
		}
		System.out.println("true");
	}
}
