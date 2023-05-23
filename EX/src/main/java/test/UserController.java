package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public UserController() {
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		//DB 저장 했다고 가정 (DB에는 emailAuth 필드가 있어야 하고 최초에는 0이 저장되어 있음) 1 인증 0 미인증
		
		//DB에 저장했으니 google email 인증 페이지로 이동
		
		response.sendRedirect("/AuthGoogle/gmailSendAction.jsp?email="+email);
		
	}
	
//	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//	    req.setCharacterEncoding("UTF-8");
//
//	    String username = req.getParameter("username");
//	    String password = req.getParameter("password");
//	    String email = req.getParameter("email");
//
//	    // DB에 회원 정보 저장하는 로직을 구현해야 합니다.
//	    // ...
//
//	    // 회원 정보 저장 후 이메일 인증 페이지로 이동
//	    response.sendRedirect("/AuthGoogle/gmailSendAction.jsp?email=" + email);
//	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		doGet(req, response);
	}
	
}
