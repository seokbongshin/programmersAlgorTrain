package Level2;

public class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		int count =0;
		// 함수를 완성하세요.
		for(int i=2;i<=n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count ++;
					break;
				}
			}
			if(count==0 ) {
				result ++;
			}
			count = 0;
		}
		return result;
	
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(10) );
	}

}
