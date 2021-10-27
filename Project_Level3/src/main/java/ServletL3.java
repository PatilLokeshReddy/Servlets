import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletL3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sname=isRev((String) req.getAttribute("k"));
		PrintWriter out=resp.getWriter();
		out.println(sname);
		req.setAttribute("name", sname);
		RequestDispatcher rq=req.getRequestDispatcher("/Display.jsp");
		rq.forward(req, resp);
		
	}
	public String isRev(String name)
	{
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		return rev;
	}
}
