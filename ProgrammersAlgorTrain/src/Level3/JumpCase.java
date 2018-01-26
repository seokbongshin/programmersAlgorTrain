package Level3;

import java.util.ArrayList;

public class JumpCase {

	public int jumpCase(int num) {
        int answer = 0;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        
        for(int i=2;i<num;i++) {
        	a.add(a.get(i-2)+a.get(i-1));
        }

        return a.get(num-1);
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }

}
