package Model;

/**
 * Created by Calin on 12.03.2017.
 */
public class Student {

    private String name;
    private Integer id;
    private String birthDate;
    private String address;

    public Student()
    {}
    public Student(Integer id, String name, String birthDate, String address)
    {
        this.id=id;
        this.name=name;
        this.birthDate=birthDate;
        this.address=address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Student)) {
            return false;
        }

        Student user = (Student) o;

        return user.name.equals(name) &&
                user.birthDate.equals(birthDate) &&
                user.address.equals(address);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}