package DAO; /**
 * Created by Calin on 12.03.2017.
 */

import Model.Student;

import javax.sql.DataSource;
import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Model.Student table.
     */
    public void create(Integer id, String name, String birthdate, String address);

    /**
     * This is the method to be used to list down
     * a record from the Model.Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the Model.Student table.
     */
    public List<Student> listStudents();

    /**
     * This is the method to be used to delete
     * a record from the Model.Student table corresponding
     * to a passed student id.
     */
   public void delete(Integer id);


     /** This is the method to be used to update
     * address record into the Model.Student table.
     */
    public void updateAddress(String name, String address);

    public void updateName(Integer id, String name);
}