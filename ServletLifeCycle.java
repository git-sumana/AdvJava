import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;

public class ServletLifeCycle extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("Servlet initialized");
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Service method invoked");
        super.service(request, response);
    }

    public void destroy() {
        System.out.println("Servlet destroyed");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();//character op:
        out.println("<html><head><title>Lifecycle Demo Servlet</title></head><body>");
        out.println("<h1>Hello from Lifecycle Demo Servlet!</h1>");
        out.println("</body></html>");
        out.close();
    }
}