package study2.mapping2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test5miMsgCommand implements Test5miInterface {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		String msg = "이곳은 Test5Msg입니다";
		requset.setAttribute("msg", msg);
		
	}

}
