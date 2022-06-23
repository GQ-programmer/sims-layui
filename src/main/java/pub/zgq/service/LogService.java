package pub.zgq.service;

import pub.zgq.pojo.Log;
import pub.zgq.pojo.User;

import java.util.List;

public interface LogService {
    List<Log> findAll();

    void addLog(Log log);
}
