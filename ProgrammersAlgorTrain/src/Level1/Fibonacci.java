package Level1;

import java.util.ArrayList;

public class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		ArrayList<Long> a = new ArrayList<>();
		a.add((long) 0);
		a.add((long) 1);
		
		for(int i=2;i<=num;i++) {
			a.add(a.get(i-1)+a.get(i-2));
		}
		
		return a.get(a.size()-1);
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
