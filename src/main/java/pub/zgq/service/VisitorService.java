package pub.zgq.service;

import pub.zgq.pojo.Visitor;

import java.util.List;


public interface VisitorService {
    List<Visitor> findAll(Visitor visitor);


    boolean addVisitor(Visitor visitor);

    void delVisitor(String v_id);
}
