package Mapper; /**
 * Created by Calin on 13.03.2017.
 */

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Enroll;
import org.springframework.jdbc.core.RowMapper;

public class EnrollMapper implements RowMapper<Enroll> {
    public Enroll mapRow(ResultSet rs, int rowNum) throws SQLException {
        Enroll enroll = new Enroll();
        enroll.setName(rs.getString("name"));
        enroll.setCourse(rs.getString("course"));
        return enroll;
    }
}