package Strings.Easy;

public class JewelsAndStones_771 {

	public static void main(String[] args) {
       int result = new JewelsAndStones_771().numJewelsInStones("aA", "aAAbbbb");
	}

	public int numJewelsInStones(String J, String S) {
		int result = 0;
		for(int i=0; i< S.length(); i++) {
			Character c = S.charAt(i);
			if(J.contains(c.toString()))
				result++;
		}
		return result;
	}
}
