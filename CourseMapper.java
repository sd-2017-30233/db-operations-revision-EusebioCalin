package Mapper; /**
 * Created by Calin on 13.03.2017.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Course;
import org.springframework.jdbc.core.RowMapper;

public class CourseMapper implements RowMapper<Course> {
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        Course course = new Course();
        course.setId(rs.getInt("id"));
        course.setName(rs.getString("name"));
        course.setTeacher(rs.getString("teacher"));
        course.setStudyyear(rs.getInt("studyyear"));
        return course;
    }
}