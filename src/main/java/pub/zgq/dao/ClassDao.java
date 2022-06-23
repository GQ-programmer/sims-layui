package pub.zgq.dao;

import org.springframework.stereotype.Repository;
import pub.zgq.pojo.Class;
import pub.zgq.pojo.Student;

import java.util.List;

@Repository
public interface ClassDao {

    /**
     * 查询所有
     * @return
     */
    public List<Class> selectAll(Class class_);

    /**
     * 根据班级编号更新学生信息
     */
    public void updateClassById(Class class_);

    void delClassById(String c_id);

    Class findOne(String c_classId);

    void insertClass(Class class_);
}
