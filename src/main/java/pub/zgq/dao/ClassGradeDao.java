package pub.zgq.dao;


import org.springframework.stereotype.Repository;
import pub.zgq.pojo.ClassGrade;

import java.util.List;

@Repository
public interface ClassGradeDao {

    List<ClassGrade> selectAll(ClassGrade classGrade);

    ClassGrade selectOne(String c_classId);

    void insertOne(ClassGrade classGrade);

    void updateClassGrade(ClassGrade classGrade);

    void deleteClassGrade(String cg_id);
}
