package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.VisitorDao;
import pub.zgq.pojo.Visitor;
import pub.zgq.service.VisitorService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class VisitorServiceImpl implements VisitorService {

    @Autowired
    private VisitorDao visitorDao;

    @Override
    public List<Visitor> findAll(Visitor visitor) {
        return visitorDao.selectAll(visitor);
    }

    @Override
    public boolean addVisitor(Visitor visitor) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss秒 E");
        String format = dateFormat.format(date);
        visitor.setCreate_time(format);
        int i = visitorDao.insertOne(visitor);
        if (i > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void delVisitor(String v_id) {
        visitorDao.deleteVistor(v_id);
    }


}
