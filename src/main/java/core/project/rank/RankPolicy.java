package core.project.rank;

import core.project.student.Student;

import java.util.ArrayList;

public interface RankPolicy {

//    int rank(Student student, ArrayList<Student> arr);
    ArrayList<Student> totalRank(ArrayList<Student> arr);
}
