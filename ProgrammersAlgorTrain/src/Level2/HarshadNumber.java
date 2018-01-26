package Level2;

public class HarshadNumber {
	public boolean isHarshad(int num){


		String p = Integer.toString(num);
		int sum = 0;
		boolean  boo = false;
		
		for(int i=0;i<p.length();i++) {
			sum+= Integer.parseInt(String.valueOf(p.charAt(i)));
		}
		
		if(num%sum==0) {
			boo = true;
		} else {
			boo = false;
		}
		

		return boo;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}

}
