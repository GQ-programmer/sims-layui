package pub.zgq.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pub.zgq.pojo.DormRepair;
import pub.zgq.pojo.Dormitory;

import java.util.List;

@Repository
public interface DormRepairDao {

    List<DormRepair> selectAll(DormRepair dormRepair);

    void insertOne(DormRepair dormRepair);

    DormRepair selectOne(@Param("d_dormitoryid") String d_dormitoryid,@Param("d_dormbuilding") String d_dormbuilding);

    void updateByR_id(DormRepair dormRepair);

    void deleteDormRepair(String r_id);
}
