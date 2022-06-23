package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.DormGradeDao;
import pub.zgq.pojo.DormGrade;
import pub.zgq.pojo.DormRepair;
import pub.zgq.service.DormGradeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class DormGradeServiceImpl implements DormGradeService {

    @Autowired
    private DormGradeDao dormGradeDao;

    @Override
    public List<DormGrade> findAll(DormGrade dormGrade) {

        return dormGradeDao.selectAll(dormGrade);
    }

    @Override
    public void updateDormGrade(DormGrade dormGrade) {
        //更新日期
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss秒 E");
        String format = dateFormat.format(date);
        dormGrade.setUpdate_time(format);
        dormGradeDao.updateDormGrade(dormGrade);
    }

    @Override
    public boolean addDormGrade(DormGrade dormGrade) {
        //添加之前，先判断是否已经存在 楼号和宿舍号的组合
        DormGrade d = dormGradeDao.selectOne(dormGrade.getD_dormitoryid(), dormGrade.getD_dormbuilding());
        if (d == null){
            //不存在
            //设置当前日期
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss秒 E");
            String format = dateFormat.format(date);
            dormGrade.setUpdate_time(format);

            //添加当前dormRepair对象
            dormGradeDao.insertOne(dormGrade);
            return true;
        }
        //存在
        return false;
    }

    @Override
    public void delDormGrade(String c_classId) {
        dormGradeDao.deleteDormGrade(c_classId);
    }
}
