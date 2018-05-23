package Leet;

public class leet14 {
	public static void main(String[] args) {
		String[] strings = {"flower","flow","flight",""};
		String result = findCommonPrefix(strings);
		System.out.println(result);
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

}
