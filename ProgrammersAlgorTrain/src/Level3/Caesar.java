package Level3;

public class Caesar {
	String caesar(String s, int n) {
		String result = "";
		int count1 = 0;
		int count2 = 0;
		String[] alphB = new String[26];
		String[] alphS = new String[26];
		
		if(n>26) n = n-26;
		
		// 함수를 완성하세요.
		for(char ch = 'A'; ch <= 'Z'; ch++){
	        alphB[count1] = String.valueOf(ch);
	        count1++;
        }
		for(char ch = 'a'; ch <= 'z'; ch++){
			alphS[count2] = String.valueOf(ch);
	        count2++;
        }
		
		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).hashCode() == 32) {
				result+=" ";
			} else if(97<=s.substring(i,i+1).hashCode() && 122 >=s.substring(i,i+1).hashCode()) {
				for(int j=0;j<alphS.length;j++) {
					
					if(s.substring(i,i+1).equals(alphS[j])) {
						if(j+n > 25) {
							result += alphS[(j+n)-alphS.length];
						} else {
							result += alphS[j+n];
						}
					}
				}
			} else if(65 <= s.substring(i,i+1).hashCode() && 90 >= s.substring(i,i+1).hashCode()) {
				for(int j=0;j<alphB.length;j++) {
					if(s.substring(i,i+1).equals(alphB[j])) {
						if(j+n > 25) {
							result += alphB[(j+n)-alphB.length];
						} else {
							result += alphB[j+n];
						}
					}
				}
			} else {
				
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}

}
