package study2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.SecurityUtil;

public class PassOk2Commond implements StudyInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid")==null ? "" : request.getParameter("mid");
		String pwd = request.getParameter("pwd")==null ? "" : request.getParameter("pwd").toUpperCase();
		
		SecurityUtil securityUtil =	new SecurityUtil();
		
		String shaPwd=securityUtil.encryptSHA256(pwd);
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		request.setAttribute("shaPwd", shaPwd);
		

	}

}
