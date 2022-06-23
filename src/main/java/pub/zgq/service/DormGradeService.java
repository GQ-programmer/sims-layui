package pub.zgq.service;

import pub.zgq.pojo.DormGrade;

import java.util.List;

public interface DormGradeService {
    List<DormGrade> findAll(DormGrade dormGrade);

    void updateDormGrade(DormGrade dormGrade);

    boolean addDormGrade(DormGrade dormGrade);

    void delDormGrade(String c_classId);

}
