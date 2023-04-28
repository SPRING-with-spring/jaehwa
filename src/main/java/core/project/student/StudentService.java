package core.project.student;

import core.project.rank.RankPolicy;

import java.util.ArrayList;

public interface StudentService {
    void register(Student student);
    Student findStudent(Long studentId);
    ArrayList findAllStudents();
    ArrayList<Student> findTotalRank();
    void setRankPolicy(RankPolicy policy);
    int rank(Student student);
}
