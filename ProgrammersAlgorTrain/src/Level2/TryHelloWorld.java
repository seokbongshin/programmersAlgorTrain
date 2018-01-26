package Level2;

import java.util.ArrayList;

public class TryHelloWorld {
	public String getDayName(int a, int b) {
        String answer = "";
        int day = 0;
        ArrayList<Integer> c = new ArrayList<>();
        c.add(31);
        c.add(29);
        c.add(31);
        c.add(30);
        c.add(31);
        c.add(30);
        c.add(31);
        c.add(31);
        c.add(30);
        c.add(31);
        c.add(30);
        c.add(31);
        
        for(int i=0;i<a-1;i++) {
        	day+=c.get(i);
        }
        day+=b;
        
        String[] dow = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        answer = dow[day%7];

        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }

}
