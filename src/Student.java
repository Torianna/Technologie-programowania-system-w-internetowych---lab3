import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String groupId;
    private List<Double> grades;

    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }


    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {

        grades.add(grade);
    }

    public double getGradesAverage() {
        Double sum = 0.0;
        if(!grades.isEmpty()) {
            for (Double mark : grades) {
                sum += mark;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;

    }


}
