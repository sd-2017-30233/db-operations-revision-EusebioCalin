package Model;

/**
 * Created by Calin on 13.03.2017.
 */
public class Course {
    private Integer id;
    private String name;
    private String teacher;
    private Integer studyyear;

    public Course()
    {}

    public Course(Integer id, String name, String teacher, Integer studyyear)
    {
        this.id=id;
        this.name=name;
        this.teacher=teacher;
        this.studyyear=studyyear;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getStudyyear() {
        return studyyear;
    }

    public void setStudyyear(Integer studyyear) {
        this.studyyear = studyyear;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Course)) {
            return false;
        }

        Course user = (Course) o;

        return user.name.equals(name) &&
                user.teacher.equals(teacher) &&
                user.studyyear==(studyyear);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + teacher.hashCode();
        result = 31 * result + studyyear;
        return result;
    }
}
