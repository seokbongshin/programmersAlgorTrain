package Level1;

public class WaterMelon {
	public String watermelon(int n){
		String result = "";
		for(int i=0;i<n/2;i++) {
			result +="수박";
		}
		
		if(n%2==0) {
			
		} else {
			result+="수";
		}		
		return result;
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}

}
