package Level2;

public class MinSum {
	public int getMinSum(int []A, int []B) {
        int answer = 0;

        for(int i=0;i<A.length-1;i++) {
            int temp1 = A[i];
            int temp2 = B[i];
            for(int j=i+1;j<A.length;j++) {
                if(temp1 > A[j]) {
                    A[i] = A[j];
                    A[j] = temp1;
                    temp1 = A[i];
                }
                if(temp2 < B[j]) {
                    B[i] = B[j];
                    B[j] = temp2;
                    temp2 = B[i];
                }
            }
        }
        
        for(int i=0;i<A.length;i++) {
        	answer += (A[i]*B[i]) ;
        }

        return answer;
    }
    public static void main(String[] args)
    {
    	MinSum test = new MinSum();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }

}
