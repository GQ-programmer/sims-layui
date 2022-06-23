package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.LogDao;
import pub.zgq.pojo.Log;
import pub.zgq.pojo.User;
import pub.zgq.service.LogService;

import java.util.List;

/**
 * @Author 孑然
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public List<Log> findAll() {

        return logDao.selectAll();
    }

    @Override
    public void addLog(Log log) {
        logDao.insertOne(log);
    }
}
