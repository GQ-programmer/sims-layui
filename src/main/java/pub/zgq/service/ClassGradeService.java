package pub.zgq.service;


import pub.zgq.pojo.ClassGrade;

import java.util.List;


public interface ClassGradeService {
    List<ClassGrade> findAll(ClassGrade classGrade);

    boolean addClassGrade(ClassGrade classGrade);

    void updateClassGrade(ClassGrade classGrade);

    void delClassGrade(String cg_id);
}
