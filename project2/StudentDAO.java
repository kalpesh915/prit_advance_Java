import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO 
{
    Connection conn;

    public StudentDAO()
    {
        conn = DBConnection.getConnection();
    }

    // INSERT STUDENT
    public boolean addStudent(Student s)
    {
        boolean status = false;

        try
        {
            String sql = "insert into student(name,email,course) values(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());

            int row = ps.executeUpdate();

            if(row > 0)
                status = true;

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return status;
    }

    // GET ALL STUDENTS
    public List<Student> getAllStudents()
    {
        List<Student> list = new ArrayList<>();

        try
        {
            String sql = "select * from student";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Student s = new Student();

                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));

                list.add(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return list;
    }

    // DELETE STUDENT
    public boolean deleteStudent(int id)
    {
        boolean status = false;

        try
        {
            String sql = "delete from student where id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if(row > 0)
                status = true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return status;
    }
}