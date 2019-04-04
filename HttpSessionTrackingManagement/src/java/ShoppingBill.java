import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ShoppingBill extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            HttpSession hs=request.getSession(true);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShoppingBill</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>ADDED INTO SESSION</h1>");
            Enumeration e;
            e = hs.getAttributeNames();
            out.println("<table border=2>");
            out.println("<tr><th>Itemname</th><th>ItemQuantity</th></tr>");
            while(e.hasMoreElements())
            {
            String getobjectfromserver=(String)e.nextElement();
            String setatserverside;
                setatserverside = (String)hs.getAttribute(getobjectfromserver);
            out.println("<tr>");
            out.println("<td>"+getobjectfromserver+"</td>");
                    out.println("<td>"+setatserverside+"</td>");
            out.println("</tr>");
            }
            out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }
}
