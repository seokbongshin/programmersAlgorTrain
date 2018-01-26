package Level1;

import java.util.Arrays;

public class TryHelloWorld {
	public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int max = 0;
        int maxA = a;
        int maxB = b;
        
        int mod = maxA % maxB;
        
        // 유클리드호제법 
        // f(a, b) = gcd(a, b)라 합시다. 이 때 a mod b = 0 이라면, f(a, b) = b임이 자명함을 알 수 있습니다. 이 때 a mod b이 0이 아닌 경우, f(a, b) = f(b, a mod b)
        while(mod>0) {
         	maxA = maxB;
         	maxB = mod ;
         	mod = maxA % maxB ;
        }
        max = maxB;
        
        int min = a * b / maxB;
        
        answer[0] = max ;
        answer[1] = min ;

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }

}
