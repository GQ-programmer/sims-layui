package pub.zgq.service;

import pub.zgq.pojo.DormRepair;
import pub.zgq.pojo.Dormitory;

import java.util.List;

public interface DormRepairService {
    List<DormRepair> findAll(DormRepair dormRepair);

    boolean addDormRepair(DormRepair dormRepair);

    void updateDormRepair(DormRepair dormRepair);

    void delDormRepair(String r_id);

}
