package core.project.student;

import java.util.ArrayList;

public interface StudentRepository {
    void save(Student student);
    Student findById(Long id);
    ArrayList<Student> findAllStudents();
}
