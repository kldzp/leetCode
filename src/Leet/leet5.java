package Leet;

public class leet5 {
	public static void main(String[] args) {
		leet5 le = new leet5();
		String string = "abddbda";
		String result = le.longestPalindrome(string);
		System.out.println(result);
	}
	public String longestPalindrome(String s) {
        int length = s.length();
        int i=1;
        int j=1;
        String subString = "";
        if (length < 2) {
			return s;
		}
        while (i<length) {
        	 j=0;
			while( i-1-j >= 0 && i+j < length) {
				 if ( s.charAt(i-1-j) != s.charAt(i+j) ) {
					 break;
				 }
				 if ( subString.length() <= 2*(j+1) ) {
						subString = s.substring(i-1-j, i+1+j);
				 }
				 j++;
			}			
			j=0;
			while( i-j >= 0 && i+j < length) {
				if ( s.charAt(i-j) != s.charAt(i+j) ) {
					break;
				}
				if ( subString.length() < 2*j +1 ) {
					subString = s.substring(i-j, i+j+1);
				}
				j++;
			}	
        	i++;
		}
        if ("".equals(subString)) {
            return s.substring(0,1);
        }else {
            return subString;
        }     
    }
}
