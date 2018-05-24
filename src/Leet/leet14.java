package Leet;

import java.sql.Time;

public class leet14 {
	public static void main(String[] args) {
		String[] strings = {"flower","flow","flight"};
		long start = System.nanoTime();
		String result = findCommonPrefix(strings);
		long mid = System.nanoTime();
		String leet = longestCommonPrefix(strings);
		long end = System.nanoTime();
		System.out.println((mid-start)-(end-mid));
	}
	public static String findCommonPrefix(String[] input) {
		if (input.length == 0) {
			return "";
		}
		String result = input[0];
		for (String string : input) {
			if (string.equals("")) {
				return "";
			}
			int length = result.length() < string.length() ? result.length() : string.length(); 
			for (int i = 0; i < length; i++) {
				if (string.regionMatches(false, 0, result, 0, length-i)) {
					result = result.substring(0, length-i);
					break;
				}
				if (i == length-1) {
					return "";
				}
			}
			
		}
		return result;
	}
	public static String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;
	}

}
