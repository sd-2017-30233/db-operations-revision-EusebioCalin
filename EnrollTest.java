package Tests;

import DAO.EnrollJDBCTemplate;
import Model.Enroll;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Calin on 13.03.2017.
 */
public class EnrollTest extends TestCase {
    EnrollJDBCTemplate enrollJDBCTemplate;
    protected void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        enrollJDBCTemplate = (EnrollJDBCTemplate)context.getBean("enrollJDBCTemplate");
    }
    public void testCreate()
    {
        Enroll enroll = new Enroll("Olimpiu","Todoran");
        enrollJDBCTemplate.create("Olimpiu","Todoran");
        Enroll enrollTest = enrollJDBCTemplate.getEnroll("Olimpiu");
        //assertEquals(student,studentTest);
        assertEquals(enroll,enrollTest);
    }
    public void testFetchFromDB()
    {
        Enroll enroll = new Enroll("Olimpiu","Todoran");
        Enroll enrollTest = enrollJDBCTemplate.getEnroll("Olimpiu");
        //assertEquals(student,studentTest);
        assertEquals(enroll,enrollTest);
    }
}
