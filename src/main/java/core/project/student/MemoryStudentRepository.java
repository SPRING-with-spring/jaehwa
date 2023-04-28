package core.project.student;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryStudentRepository implements StudentRepository{

    private static Map<Long, Student> store = new HashMap<>();

    @Override
    public void save(Student student) {
        store.put(student.getId(), student);
    }

    @Override
    public Student findById(Long id) {
        return store.get(id);
    }

    @Override
    public ArrayList<Student> findAllStudents() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        store.forEach((id, student)->{
            studentArrayList.add(student);
        });
        return studentArrayList;
    }
}
