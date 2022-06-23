package pub.zgq.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pub.zgq.pojo.Dormitory;

import java.util.List;

/**
 * @Author 孑然
 */
@Repository
public interface DormitoryDao {


    List<Dormitory> selectAll(Dormitory dormitory);

    Dormitory selectOne(@Param("d_dormitoryid") String d_dormitoryid, @Param("d_dormbuilding") String d_dormbuilding);

    void insertOne(Dormitory dormitory);

    void updateByD_id(Dormitory dormitory);

    void deleteDorm(String d_id);
}
