package Leet;

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
/*
public class leet9 {
	public static void main(String[] args) {
		int x = -121;
		boolean flag = IsPalindrome(x);
		System.out.println(flag);
	}
	
	public static boolean IsPalindrome(int x) {
	    // Special cases:
	    // As discussed above, when x < 0, x is not a palindrome.
	    // Also if the last digit of the number is 0, in order to be a palindrome, 
	    // the first digit of the number also needs to be 0.
	    // Only 0 satisfy this property.
	    if(x < 0 || (x % 10 == 0 && x != 0)) {
	        return false;
	    }
	    
	    int revertedNumber = 0;
	    while(x > revertedNumber) {
	        revertedNumber = revertedNumber * 10 + x % 10;
	        x /= 10;
	    }
	    
	    // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
	    // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123, 
	    // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}
*/
