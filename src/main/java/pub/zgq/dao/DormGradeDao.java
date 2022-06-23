package pub.zgq.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.DormGrade;

import java.util.List;

@Repository
public interface DormGradeDao {
    List<DormGrade> selectAll(DormGrade dormGrade);

    void updateDormGrade(DormGrade dormGrade);

    DormGrade selectOne(@Param("d_dormitoryid") String d_dormitoryid,@Param("d_dormbuilding") String d_dormbuilding);

    void insertOne(DormGrade dormGrade);

    void deleteDormGrade(String c_classId);
}
