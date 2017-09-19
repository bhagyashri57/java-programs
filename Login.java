package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;


public class Login extends HttpServlet{
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		System.out.println("Hello");
		String un=request.getParameter("t1");
		System.out.println("UserName="+un);
		String pw=request.getParameter("t2");
		System.out.println("password="+pw);
		
		PrintWriter Out=response.getWriter();
		Out.write("<html>");
		Out.write("<head></head>");
		Out.write("<body>");
		Out.write("THis is my response page");
		Out.write("</body>");
		Out.write("</html>");
		

	}
	

}
