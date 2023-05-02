package study2.mapping;

import javax.servlet.ServletContext;

public class Test5Service {


	public int test5Clac(int su1,int su2, String op) {
		int res = 0;
		if(op.equals("+")) res=su1+su2;
		else if(op.equals("-")) res=su1-su2;
		else if(op.equals("*")) res=su1*su2;
		else if(op.equals("/")) res=su1/su2;
		else res = su1%su2;
		return res;
	}
	
	
	
	
}
