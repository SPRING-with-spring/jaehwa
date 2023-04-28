package core.project.rank;

import core.project.student.MemoryStudentRepository;
import core.project.student.Student;
import core.project.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


@Component
@Primary
public class ScoreRankPolicy implements RankPolicy{

    @Override
    public ArrayList<Student> totalRank(ArrayList<Student> arr) {
        Collections.sort(arr, Comparator.comparing(Student::getScore));
        return arr;
    }

}
