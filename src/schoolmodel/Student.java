package schoolmodel;

import java.util.List;

public class Student {

    private List<Double> studentGrades;

    public Student(List<Double> studentGrades){
        this.studentGrades = studentGrades;
    }

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public double getAverageGrade(){
        Double total = 0.0;
        Double average = 0.0;
        for(Double grades: studentGrades){
            total += grades;
        }
        average = total / studentGrades.size();
        return average;

    }
}
