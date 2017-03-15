package Tests;

/**
 * Created by Calin on 13.03.2017.
 */
import DAO.StudentJDBCTemplate;
import Model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import junit.framework.*;
import static org.junit.Assert.assertEquals;
public class StudentTest extends TestCase {
    StudentJDBCTemplate studentJDBCTemplate;
    protected void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
    }
    public void testCreate()
    {

        Student student = new Student(1,"Zara","09/03/1998","ABrud");
        studentJDBCTemplate.delete(1);
        studentJDBCTemplate.create(1,"Zara", "09/03/1998","ABrud");
        Student studentTest = studentJDBCTemplate.getStudent(1);
        //assertEquals(student,studentTest);
        assertEquals(student,studentTest);
    }
    public void testUpdateName()
    {
        Student student = new Student(1,"Zaraza","09/03/1998","ABrud");
        studentJDBCTemplate.delete(1);
        studentJDBCTemplate.create(1,"Zara", "09/03/1998","ABrud");
        studentJDBCTemplate.updateName(1,"Zaraza");
        Student studentTest = studentJDBCTemplate.getStudent(1);
        //assertEquals(student,studentTest);
        assertEquals(student.getName(),studentTest.getName());
    }
    public void testFetchFromDB()
    {
        Student student = new Student(1,"Zaraza","09/03/1998","ABrud");
        Student studentTest = studentJDBCTemplate.getStudent(1);
        //assertEquals(student,studentTest);
        assertEquals(student.getName(),studentTest.getName());
    }
}
