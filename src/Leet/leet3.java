package Leet;

import java.util.HashMap;
import java.util.Map;

public class leet3 {
	public static void main(String[] args) {
		leet3 le =new leet3();
		String string = "abcabcbb";
		int length = le.lengthOfLongestSubstring(string);
		System.out.println(length);
	}
    public int lengthOfLongestSubstring(String s) {
        /*
        String sub = "";
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			String ccc = s.substring(i, i+1);
			if ( sub.contains( ccc ) ) {
				max =max < sub.length()? sub.length():max;
				sub = sub.substring( sub.indexOf( ccc )+1 );
				sub = sub.concat( ccc );		
			}else {
				sub=sub.concat(s.substring(i, i+1));
			}
		}
		return max>sub.length()?max:sub.length();
        */
        if (s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
	}
}
