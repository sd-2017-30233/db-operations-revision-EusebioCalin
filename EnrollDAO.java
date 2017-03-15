package DAO; /**
 * Created by Calin on 13.03.2017.
 */
import Model.Enroll;

import java.util.List;
import javax.sql.DataSource;

public interface EnrollDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Model.Student table.
     */
    public void create(String student, String course);

    /**
     * This is the method to be used to list down
     * a record from the Model.Student table corresponding
     * to a passed student id.
     */
    //  public Model.Student getStudent(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the Model.Student table.
     */
    public List<Enroll> listEnrolls();

    /**
     * This is the method to be used to delete
     * a record from the Model.Student table corresponding
     * to a passed student id.
     */
  /*  public void delete(Integer id);


     * This is the method to be used to update
     * a record into the Model.Student table.
     */
    // public void update(String address, String name);
}