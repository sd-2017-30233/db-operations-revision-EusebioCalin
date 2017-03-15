package Model;

/**
 * Created by Calin on 13.03.2017.
 */
public class Enroll {
    String name;
    String course;

    public Enroll()
    {}
    public Enroll(String name , String course)
    {
        this.name=name;
        this.course=course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Enroll)) {
            return false;
        }

        Enroll user = (Enroll) o;

        return user.name.equals(name) &&
                user.course.equals(course) ;
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + course.hashCode();
        return result;
    }
}
