package Level3;

public class NextBigNumber {
	public int countOne(int n) {
		int count = 0;
		while(true) {
        	if(n<2) {
        		count ++;
        		break;
        	} else if(n%2==0) {
        		n = n/2;
        	} else {
        		count ++;
        		n = n/2;
        	}
        }
		
		return count;
	}
	public int nextBigNumber(int n)
    {
        int answer = 0;
        
//        ArrayList<Integer> r = new ArrayList<>();
//        while(true) {
//        	if(n<2) {
//        		r.add(1);
//        		break;
//        	} else if(n%2==0) {
//        		r.add(0);
//        		n = n/2;
//        	} else {
//        		r.add(1);
//        		n = n/2;
//        	}
//        }
        
//        for(int i=(r.size()-1);i>-1;i--) {
//        	System.out.print(r.get(i));
//        	
//        }
        NextBigNumber test = new NextBigNumber();
        int oneCount = test.countOne(n);
        
        for(int i=n+1;i<=1000000;i++) {
        	if(oneCount == test.countOne(i)) {
        		answer = i;
        		break;
        	}
        }

        return answer;
    }
    public static void main(String[] args)
    {
    	NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }

}
