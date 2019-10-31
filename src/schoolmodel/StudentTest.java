package schoolmodel;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> studentGrades = Arrays.asList(12.5, 3.5, 4.6);
        Student student = new Student(studentGrades);
        Double average = student.getAverageGrade();
        assertEquals(66.866, average);
    }
}