import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Logging Info</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("</body></html>");
    }

    public void destroy(){
        System.out.println("Destroy!");
    }
}
