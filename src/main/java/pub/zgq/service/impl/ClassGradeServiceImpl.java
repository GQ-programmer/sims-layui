package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.ClassGradeDao;
import pub.zgq.pojo.ClassGrade;
import pub.zgq.pojo.DormGrade;
import pub.zgq.service.ClassGradeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class ClassGradeServiceImpl implements ClassGradeService {

    @Autowired
    private ClassGradeDao classGradeDao;

    @Override
    public List<ClassGrade> findAll(ClassGrade classGrade) {
        return classGradeDao.selectAll(classGrade);
    }

    @Override
    public boolean addClassGrade(ClassGrade classGrade) {
        //添加之前，先判断是否已经存在 楼号和宿舍号的组合
        ClassGrade d = classGradeDao.selectOne(classGrade.getC_classId());
        if (d == null){
            //不存在
            //设置当前日期
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss秒 E");
            String format = dateFormat.format(date);
            classGrade.setUpdate_time(format);

            //添加当前dormRepair对象
            classGradeDao.insertOne(classGrade);
            return true;
        }
        //存在
        return false;
    }

    @Override
    public void updateClassGrade(ClassGrade classGrade) {
        //更新日期
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss秒 E");
        String format = dateFormat.format(date);
        classGrade.setUpdate_time(format);
        classGradeDao.updateClassGrade(classGrade);
    }

    @Override
    public void delClassGrade(String cg_id) {
         classGradeDao.deleteClassGrade(cg_id);
    }
}
