import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {


    private List<Teacher> teachers= new ArrayList<>();

    public Teacher(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);

    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

}
