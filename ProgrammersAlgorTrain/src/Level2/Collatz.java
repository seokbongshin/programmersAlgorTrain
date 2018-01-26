package Level2;

public class Collatz {
	public int collatz(int num) {
		int answer = 0;
		long num2 = num;
		
		for(int i=0;i<500;i++) {
			if(num2==1) {
				answer = i;
				break;
			}
			if(num2%2 == 0) {
				num2 = num2/2;
			} else {
				num2 = num2 * 3 + 1;
			}
		}
		
		if(answer==0 && num2!=1) answer = -1;
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}

}
