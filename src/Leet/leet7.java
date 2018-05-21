package Leet;

public class leet7 {
	public static void main(String[] args) {
		leet7 le = new leet7();
		int x = 1212;
		int result = le.reverse(x);
		System.out.println(result);
	}

	public int reverse(int x) {

        if( x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE ) return 0;
        if(x > 0){
            return subreverse(x);
        }else{
            return 0-subreverse(-x);
        }

    }
    public int subreverse(int x){
        int result = 0;
        while(x != 0){
            if(result <= Integer.MAX_VALUE/10){
                result = result*10 + x%10;
                x = x/10;
            }else{
                return 0;
            }

        }
        return result;
    }
}
