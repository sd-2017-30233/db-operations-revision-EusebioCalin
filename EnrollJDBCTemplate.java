package DAO;

import DAO.EnrollDAO;
import Mapper.EnrollMapper;
import Model.Enroll;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;
/**
 * Created by Calin on 13.03.2017.
 */
public class EnrollJDBCTemplate implements EnrollDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String name, String course){
        String SQL = "insert into Enroll (name, course) values (?, ?)";
        jdbcTemplateObject.update( SQL, name,course);
        System.out.println("Created Record Name = "+ name + " Model.Course = " + course );
        return;
    }
    public List<Enroll> listEnrolls() {
        String SQL = "select * from enroll";
        List <Enroll> enrolls = jdbcTemplateObject.query(SQL, new EnrollMapper());
        return enrolls;
    }
    public Enroll getEnroll(String name)
    {
        String SQL = "SELECT * FROM enroll where name = ?";
        Enroll enroll=  jdbcTemplateObject.queryForObject(SQL, new Object[] { name }, new EnrollMapper());
        return enroll;
    }
}
