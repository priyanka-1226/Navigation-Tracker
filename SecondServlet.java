import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        String name = (String) req.getAttribute("user");

        out.println("<h2>Welcome " + name + "</h2>");
    }
}
