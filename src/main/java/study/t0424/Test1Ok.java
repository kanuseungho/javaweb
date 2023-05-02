package study.t0424;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/t0424/Test1Ok")
public class Test1Ok extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * request.setCharacterEncoding("utf-8");
		 * response.setContentType("text/html; charset=utf-8");
		 */
		
		
		// null 값 체크 
		String name = request.getParameter("name")==null?"":request.getParameter("name");
		int age = request.getParameter("age")==null?0:Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender")==null?"":request.getParameter("gender");
		String job = request.getParameter("job")==null?"":request.getParameter("job");
		String address = request.getParameter("address")==null?"":request.getParameter("address");
		
		
		//DB에 삽입 처리 하고자 한다면 입력 받은 변수의 값을vo에 담아서 처리
		Test1VO vo = new Test1VO();
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		request.setAttribute("vo", vo);
		String viewPage ="/study/0424/test1Res.jsp";
		
		request.getRequestDispatcher(viewPage).forward(request, response);
	}


}
