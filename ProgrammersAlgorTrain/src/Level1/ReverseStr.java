package Level1;

public class ReverseStr {
	public String reverseStr(String str){
		
		String[]a = new String[str.length()];
		
		for(int i=0;i<a.length;i++) {
			a[i] = String.valueOf(str.charAt(i));
		}

		for(int i=0;i<a.length-1;i++) {
			String temp = a[i];
			for(int j=i+1;j<a.length;j++) {
				if(temp.compareTo(a[j]) < 0) {
					a[i] = a[j];
					a[j] = temp;
					temp = a[i];
				}
			}
		}
		StringBuilder re = new StringBuilder();
		for(int i=0;i<a.length;i++) {
			re.append(a[i]);
		}
		
		return re.toString();
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}

}
