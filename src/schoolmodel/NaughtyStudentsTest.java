package schoolmodel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentsTest {

    @Test
    void getAverageGrade() {
        List<Double> naughtyGrades = Arrays.asList(12.5, 54.7, 84.8);
        NaughtyStudents naughtyStudent = new NaughtyStudents(naughtyGrades);
        Double naughtyStudentGrade = naughtyStudent.getAverageGrade();
        assertEquals(45.77, naughtyStudentGrade);
    }
}