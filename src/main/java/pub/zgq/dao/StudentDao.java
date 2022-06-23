package pub.zgq.dao;

import org.springframework.stereotype.Repository;
import pub.zgq.pojo.Student;

import java.util.List;

@Repository
public interface StudentDao {

    /**
     * 查询学生列表
     * @return
     */
    public List<Student> findAll(Student student);

    /**
     * 根据学号更新学生信息
     */
    public void updateStu(Student student);

    /**
     * 添加学生
     */
    public void addStu(Student student);

    /**
     * 根据学号删除学生
     */
    public void delStu(String sid);

    /**
     * 根据学号查询学生是否存在
     */
    public Student findOne(Student student);
}
