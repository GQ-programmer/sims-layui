package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.DormRepairDao;
import pub.zgq.pojo.DormRepair;
import pub.zgq.pojo.Dormitory;
import pub.zgq.service.DormRepairService;
import pub.zgq.service.DormitoryService;

import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class DormRepairServiceImpl implements DormRepairService {

    @Autowired
    private DormRepairDao dormRepairDao;

    @Override
    public List<DormRepair> findAll(DormRepair dormRepair) {

        return dormRepairDao.selectAll(dormRepair);
    }

    @Override
    public boolean addDormRepair(DormRepair dormRepair) {
        //添加之前，先判断是否已经存在 楼号和宿舍号的组合
        DormRepair d = dormRepairDao.selectOne(dormRepair.getD_dormitoryid(), dormRepair.getD_dormbuilding());
        if (d == null){
            //不存在
            //添加当前dormRepair对象
            dormRepairDao.insertOne(dormRepair);
            return true;
        }
        //存在
        return false;
    }

    @Override
    public void updateDormRepair(DormRepair dormRepair) {
        dormRepairDao.updateByR_id(dormRepair);
    }

    @Override
    public void delDormRepair(String r_id) {
        dormRepairDao.deleteDormRepair(r_id);
    }
}
