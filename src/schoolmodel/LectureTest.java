package schoolmodel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    Lecture enter() {
        List<Double> studentGrades1 = Arrays.asList(22.50, 3.52, 4.68);
        Student student1 = new Student(studentGrades1);
        List<Double> studentGrades2 = Arrays.asList(12.50, 44.52, 57.68);
        Student student2 = new Student(studentGrades2);
        List<Double> studentGrades3 = Arrays.asList(62.50, 53.52, 64.68);
        NaughtyStudents student3 = new NaughtyStudents(studentGrades3);
        List<Double> studentGrades4 = Arrays.asList(52.50, 37.52, 48.68);
        NaughtyStudents student4 = new NaughtyStudents(studentGrades4);
        Lecture lecture1 = new Lecture();
        lecture1.Enter(student1);
        lecture1.Enter(student2);
        lecture1.Enter(student3);
        lecture1.Enter(student4);

        return lecture1;






    }

    @Test
    void getHighestGrade() {
        Lecture lecture1 = enter();
        Double highest = lecture1.getHighestGrade();
        assertEquals(6.86, highest);
    }
}