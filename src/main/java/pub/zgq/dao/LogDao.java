package pub.zgq.dao;

import org.springframework.stereotype.Repository;
import pub.zgq.pojo.Log;
import pub.zgq.pojo.User;

import java.util.List;

@Repository
public interface LogDao {
    List<Log> selectAll();

    void insertOne(Log log);
}
