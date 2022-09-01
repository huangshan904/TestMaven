import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:huang
 * Date: 2022-09-01-10:22
 * Description:<描述>
 */
@WebServlet( "/servletMaven")
public class ServletMaven extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println("hello maven!!");
        response.getWriter().println("创新新分支，分支提交");
        response.getWriter().println("创建了，分支提交");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
