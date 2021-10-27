import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Project_L3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String phone_num=req.getParameter("pn");
		String k=name+phone_num;
		req.setAttribute("k",k);
		RequestDispatcher rq=req.getRequestDispatcher("sq");
		rq.forward(req, resp);
	}

}
