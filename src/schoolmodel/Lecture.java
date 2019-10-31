package schoolmodel;

import java.util.ArrayList;
import java.util.List;

public class Lecture  {
    private Student student;

    private List<Student> lectureStudents = new ArrayList<>();

    public void Enter(Student student){
        lectureStudents.add(student);
    }

    public Double getHighestGrade(){
        Double highest = 0.0;
        for(Student students: lectureStudents){
            if(students.getAverageGrade() > highest){
                highest = students.getAverageGrade();
            }

        }
        return highest;
    }
}
