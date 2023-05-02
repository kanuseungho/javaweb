package study2.mapping2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test5miGugudan implements Test5miInterface {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		int dan= requset.getParameter("dan")==null?2:Integer.parseInt(requset.getParameter("dan"));
		System.out.println("구구단:"+dan);
		String str="["+dan+"]단<br/>";
		for(int i=1; i<10; i++) {
			str +=dan + "*"+ i +"="+(dan*i)+"<br/>";
		}
		requset.setAttribute("str", str);

	}

}
