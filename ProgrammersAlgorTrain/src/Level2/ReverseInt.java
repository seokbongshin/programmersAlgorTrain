package Level2;

public class ReverseInt {
	public int reverseInt(int n){
		String str = String.valueOf(n);
		int[]a = new int[str.length()];

		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
	
		for(int i=0;i<a.length-1;i++) {
			int temp = a[i];
			for(int j=i+1;j<a.length;j++) {
				if(temp < a[j]) {
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
		
	    
		return Integer.parseInt(re.toString());
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}

}
