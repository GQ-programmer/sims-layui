package pub.zgq.service;

import pub.zgq.pojo.Class;
import pub.zgq.pojo.Student;

import java.util.List;

public interface ClassService {

    List<Class> findAll(Class class_);

    void updateClass(Class class_);
    
    boolean addClass(Class class_);


    void delStu(String c_id);

}
