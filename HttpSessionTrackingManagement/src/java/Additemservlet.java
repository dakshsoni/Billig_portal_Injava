import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Additemservlet extends HttpServlet {

 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
            HttpSession hs=request.getSession(true);
            String itemname=request.getParameter("selectfru");
            String itemquantity=request.getParameter("qty");
            hs.setAttribute(itemname, itemquantity);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Additemservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Item added</h1>");
            out.println("click here the following link to go to home");
            out.println("<a href='./index.html'>click here</a>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        
    
        }
    }
}
