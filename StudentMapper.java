package Mapper; /**
 * Created by Calin on 12.03.2017.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setBirthDate(rs.getString("birthdate"));
        student.setAddress(rs.getString("address"));


        return student;
    }
}