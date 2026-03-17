import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        Student s = new Student();
        
        s.setName(name);
        s.setEmail(email);
        s.setCourse(course);

        StudentDAO dao = new StudentDAO();

        if(dao.addStudent(s))
        {
            response.sendRedirect("listStudents.jsp");
        }
        else
        {
            response.sendRedirect("addStudent.jsp");
        }
    }
}