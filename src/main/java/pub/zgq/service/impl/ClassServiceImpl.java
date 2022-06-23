package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.ClassDao;
import pub.zgq.pojo.Class;
import pub.zgq.pojo.Student;
import pub.zgq.service.ClassService;

import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassDao classDao;

    @Override
    public List<Class> findAll(Class class_) {
        return classDao.selectAll(class_);
    }

    @Override
    public void updateClass(Class class_) {
        classDao.updateClassById(class_);
    }

    @Override
    public boolean addClass(Class class_) {
        //添加前先判断该班级ID是否已经存在
        Class findClass = classDao.findOne(class_.getC_classId());
        if (findClass != null){
            //该班级Id已存在
            return false;
        }
        //不存在，则插入数据
        classDao.insertClass(class_);
        return true;
    }

    @Override
    public void delStu(String c_id) {
        classDao.delClassById(c_id);

    }
}
