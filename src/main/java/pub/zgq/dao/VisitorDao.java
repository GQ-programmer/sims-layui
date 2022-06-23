package pub.zgq.dao;

import org.springframework.stereotype.Repository;
import pub.zgq.pojo.Visitor;

import java.util.List;

@Repository
public interface VisitorDao {
    List<Visitor> selectAll(Visitor visitor);

    int insertOne(Visitor visitor);

    void deleteVistor(String v_id);

}
