package pub.zgq.service;

import pub.zgq.dao.StudentDao;
import pub.zgq.pojo.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll(Student student);
    public void updateStu(Student student);
    public boolean addStu(Student student);
    public void delStu(String sid);
    public Student findOne(Student student);
}
