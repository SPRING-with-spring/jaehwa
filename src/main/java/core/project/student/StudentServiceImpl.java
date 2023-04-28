package core.project.student;

import core.project.rank.RankPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private RankPolicy rankPolicy;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, RankPolicy rankPolicy){
        this.studentRepository = studentRepository;
        this.rankPolicy = rankPolicy;
    }


    @Override
    public void register(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public ArrayList<Student> findAllStudents() {
        return studentRepository.findAllStudents();
    }

    @Override
    public ArrayList<Student> findTotalRank() {
        return rankPolicy.totalRank(findAllStudents());
    }

    @Override
    public void setRankPolicy(RankPolicy policy) {
        this.rankPolicy = policy;
    }

    @Override
    public int rank(Student student) {
        ArrayList<Student> arr = findTotalRank();
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            if (student.getId() == s.getId()) {
                return arr.size() - i;
            }
        }
        return -1;
    }


}
