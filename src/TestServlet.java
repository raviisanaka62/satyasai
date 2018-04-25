import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet 
 {

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		request.setAttribute("test","test");
		//request.setAttribute("attr", "<b onmouseover=alert('Wufff!')>click me!</b>");//"%3cscript%3ealert(document.cookie)%3c/script%3e
		request.setAttribute("attr", "<script>alert(document.cookie)</script>");//"%3cscript%3ealert(document.cookie)%3c/script%3e
		
        RequestDispatcher rd=request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
	}
}
