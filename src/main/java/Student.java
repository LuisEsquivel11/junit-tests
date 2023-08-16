import java.util.ArrayList;

public class Student {

private String name;
private double id;

private ArrayList<Integer> grades;
    public Student(String name, double id) {
        ArrayList<Integer> grades = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
