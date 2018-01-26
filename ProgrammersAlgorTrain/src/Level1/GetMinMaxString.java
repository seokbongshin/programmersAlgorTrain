package Level1;

public class GetMinMaxString {
	public String getMinMaxString(String str) {
        String s[] = str.split(" ");
		String min = s[0];
		String max = s[0];
		for(int i=1;i<s.length;i++) {
			if(Integer.parseInt(min) > Integer.parseInt(s[i])  ) {
				min = s[i];
			}
			if(Integer.parseInt(max) < Integer.parseInt(s[i])  ) {
				max = s[i];
			}
		}
		
		System.out.println(min+"   "+max);
        return min+" "+max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }

}
