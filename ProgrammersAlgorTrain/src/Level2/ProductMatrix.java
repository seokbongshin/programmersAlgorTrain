package Level2;

public class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];
		int sum = 0;
		
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer[i].length;j++) {
//				System.out.println("i: "+i+"  j: "+j);
				for(int k=0;k<A[i].length;k++) {
					sum += A[i][k] * B[k][j];
				}
				answer[i][j] = sum ;
//				System.out.println(answer[i][j]);
				sum = 0;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };
      // 아래는 테스트로 출력해 보기 위한 코드입니다.
      System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
	}

}
