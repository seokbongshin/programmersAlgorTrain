package Level3;

public class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
		int max = 0;
		int index = 0;
		int sum = 0;
		
		for(int i=0;i<works.length;i++) {
			sum+=works[i];
		}
		
		if(no >= sum) {
			result = 0;
		} else {
			for(int i=0;i<no;i++) {
				max = works[0];
				index = 0;
				for(int j=0;j<works.length;j++) {
					if(max < works[j]) {
						max = works[j];
						index = j;
					}
				}
				works[index] = works[index]-1;
			}
			
			for(int i=0;i<works.length;i++) {
				result += works[i]*works[i];
			}
		}
		
		

		return result;
	}
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {4,4,3};
		System.out.println(c.noOvertime(4,test));
	}

}
