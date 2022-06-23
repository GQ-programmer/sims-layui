package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.StudentDao;
import pub.zgq.pojo.Student;
import pub.zgq.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll(Student student) {
        return studentDao.findAll(student);
    }

    @Override
    public void updateStu(Student student) {
        studentDao.updateStu(student);
    }

    @Override
    public boolean addStu(Student student) {
        //添加之前判断该学号是否已经存在
        Student stu = studentDao.findOne(student);
        if (stu != null){
            //已经存在，返回false
            return false;
        }
        studentDao.addStu(student);
        return true;
    }

    @Override
    public void delStu(String sid) {
        studentDao.delStu(sid);
    }

    @Override
    public Student findOne(Student student) {
        return studentDao.findOne(student);
    }


}
