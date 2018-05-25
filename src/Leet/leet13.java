
package Leet;

/**
 * @author zp
 *
 */
public class leet13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "MCMXCIV";
		int num = calculate(input);
		System.out.println(num);
	}
	public static boolean check(int i,int length,int result) {
		if (i>=length) {
			return true;
		}
		return false;
	}
	public static int calculate(String s) {
		int i = 0;
		int result = 0;
		char[] ch = s.toCharArray();
		int length = ch.length;
		for (int j = 0; j < length/2; j++) {
			char temp = ch[j];
			ch[j] = ch[length-1-j];
			ch[length-1-j] = temp;
		}
		//under 10
		if (i>=length) {
			return result;
		}
		while (ch[i] == 'I') {
			result += 1;
			i +=1;
			if (i>=length) {
				return result;
			}
		}
		System.out.println(result);
		if (ch[i] == 'V') {
			result += 5;
			i +=1;
			if (i>=length) {
				return result;
			}
			if (ch[i] == 'I') {
				result -= 1;
				i +=1;
				if (i>=length) {
					return result;
				}
			}		
		}else if (ch[i] == 'X') {
			result += 10;
			i +=1;
			if (i>=length) {
				return result;
			}
			if (ch[i] == 'I') {
				result -= 1;
				i +=1;
				if (i>=length) {
					return result;
				}
			}
		}
		System.out.println(result);
		//under 100
		while (ch[i] == 'X') {
			result += 10;
			i +=1;
			if (i>=length) {
				return result;
			}
		}
		System.out.println(result);
		if (ch[i] == 'L') {
			result += 50;
			i +=1;
			if (i>=length) {
				return result;
			}
			if (ch[i] == 'X') {
				result -= 10;
				i +=1;
				if (i>=length) {
					return result;
				}
			}		
		}else if (ch[i] == 'C') {
			result += 100;
			i +=1;
			if (i>=length) {
				return result;
			}
			if (ch[i] == 'X') {
				result -= 10;
				i +=1;
				if (i>=length) {
					return result;
				}
			}
		}
		System.out.println(result);
		//under 1000
		while (ch[i] == 'C') {
			result += 100;
			i +=1;
			if (i>=length) {
				return result;
			}
		}
		System.out.println(result);
		if (ch[i] == 'D') {
			result += 500;
			i +=1;
			if (i>=length) {
				return result;
			}
			if (ch[i] == 'C') {
				result -= 100;
				i +=1;
				if (i>=length) {
					return result;
				}
			}		
		}else if (ch[i] == 'M') {
			result += 1000;
			i +=1;
			if (i>=length) {
				return result;
			}
			if (ch[i] == 'C') {
				result -= 100;
				i +=1;
				if (i>=length) {
					return result;
				}
			}
		}
		System.out.println(result);
		//
		while (ch[i] == 'M') {
			result += 1000;
			i +=1;
			if (i>=length) {
				return result;
			}
		}
		System.out.println(result);
		return result;
	}
}
