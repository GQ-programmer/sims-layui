package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.DormitoryDao;
import pub.zgq.pojo.Dormitory;
import pub.zgq.service.DormitoryService;

import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class DormitoryServiceImpl implements DormitoryService {


    @Autowired
    private DormitoryDao dormitoryDao;

    @Override
    public List<Dormitory> findAll(Dormitory dormitory) {

        return dormitoryDao.selectAll(dormitory);
    }

    @Override
    public boolean addDorm(Dormitory dormitory) {
        //添加之前，先判断是否已经存在 楼号和宿舍号的组合
        Dormitory d = dormitoryDao.selectOne(dormitory.getD_dormitoryid(), dormitory.getD_dormbuilding());
        if (d == null){
            //不存在
            //添加当前dormitory对象
            dormitoryDao.insertOne(dormitory);
            return true;
        }
        //存在
        return false;
    }

    @Override
    public void updateDorm(Dormitory dormitory) {
        dormitoryDao.updateByD_id(dormitory);

    }

    @Override
    public void delDorm(String d_id) {
        dormitoryDao.deleteDorm(d_id);

    }
}
