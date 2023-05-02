package study2.mapping2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study2.mapping.Test5Service;
@SuppressWarnings("serial")
//@WebServlet("/mapping/Test5.do")
@WebServlet("*.mi")
public class Test5miController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		Test5miInterface command = null;
		
		//uri의 앞에 주소를 미리 저장해둠
		String viewPage="/WEB-INF/study2/mapping2";
		
		String uri = request.getRequestURI();
		//uri 중에서 /Test5와 같이 앞에와 뒤에 주소를 떼줌 
		String com=uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
		System.out.println("com : "+com);
		
		if(com.equals("/Test5")) {
			viewPage+="/test5.jsp";
		}
		else if (com.equals("/Test5_2")) {
			viewPage+="/test5_2.jsp";
		}
		else if (com.equals("/Test5_3")) {
			System.out.println("구구단333:");
			command =new Test5miGugudan();
			command.execute(request, response);
			viewPage+="/test5_3.jsp";
		}
		else if (com.equals("/Test5_4")) {
			command = new Test5miMsgCommand();
			command.execute(request, response);
			viewPage+="/test5_4.jsp";
		}
		else if (com.equals("/Test5_5")) {
		command	=new Test5miCommand();
		command.execute(request, response);
			Test5Service t5 = new Test5Service();
			viewPage+="/test5_5.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
