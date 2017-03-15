package Tests;

import DAO.CourseJDBCTemplate;
import DAO.StudentJDBCTemplate;
import Model.Course;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Calin on 13.03.2017.
 */
public class CourseTest extends TestCase {
    CourseJDBCTemplate courseJDBCTemplate;
    protected void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        courseJDBCTemplate = (CourseJDBCTemplate)context.getBean("courseJDBCTemplate");
    }
    public void testCreate()
    {
        Course course = new Course(1,"Olimpiu","Todoran",3);
        courseJDBCTemplate.delete(1);
        courseJDBCTemplate.create(1,"Olimpiu","Todoran",3);
        Course courseTest = courseJDBCTemplate.getCourse(1);
        //assertEquals(student,studentTest);
        assertEquals(course,courseTest);
    }
    public void testUpdateName()
    {
        Course course = new Course(1,"Zaraza","09/03/1998",3);
        courseJDBCTemplate.delete(1);
        courseJDBCTemplate.create(1,"Zara", "09/03/1998",3);
        courseJDBCTemplate.updateCourseName(1,"Zaraza");
        Course courseTest = courseJDBCTemplate.getCourse(1);
        //assertEquals(student,studentTest);
        assertEquals(course,courseTest);
    }
    public void testFetchFromDB()
    {
        Course student = new Course(1,"Zaraza","09/03/1998",3);
        Course studentTest = courseJDBCTemplate.getCourse(1);
        //assertEquals(student,studentTest);
        assertEquals(student,studentTest);
    }
}
