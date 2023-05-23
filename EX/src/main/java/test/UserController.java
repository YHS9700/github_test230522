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
		
		//DB ���� �ߴٰ� ���� (DB���� emailAuth �ʵ尡 �־�� �ϰ� ���ʿ��� 0�� ����Ǿ� ����) 1 ���� 0 ������
		
		//DB�� ���������� google email ���� �������� �̵�
		
		response.sendRedirect("/AuthGoogle/gmailSendAction.jsp?email="+email);
		
	}
	
//	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//	    req.setCharacterEncoding("UTF-8");
//
//	    String username = req.getParameter("username");
//	    String password = req.getParameter("password");
//	    String email = req.getParameter("email");
//
//	    // DB�� ȸ�� ���� �����ϴ� ������ �����ؾ� �մϴ�.
//	    // ...
//
//	    // ȸ�� ���� ���� �� �̸��� ���� �������� �̵�
//	    response.sendRedirect("/AuthGoogle/gmailSendAction.jsp?email=" + email);
//	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		doGet(req, response);
	}
	
}
