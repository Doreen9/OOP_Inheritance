package schoolmodel;

import java.util.List;

public class NaughtyStudents extends Student {
    public NaughtyStudents(List<Double> studentGrades) {
        super(studentGrades);
    }

    @Override
    public double getAverageGrade() {
        Double result = super.getAverageGrade();
        result += 0.1;
        return result;
    }
}
