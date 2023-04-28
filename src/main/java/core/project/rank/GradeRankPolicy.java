package core.project.rank;

import core.project.student.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


@Component
public class GradeRankPolicy implements RankPolicy{


    @Override
    public ArrayList<Student> totalRank(ArrayList<Student> arr) {
        Collections.sort(arr, Comparator.comparing(Student::getGrade));
        Collections.reverse(arr);
        return arr;
    }
}
