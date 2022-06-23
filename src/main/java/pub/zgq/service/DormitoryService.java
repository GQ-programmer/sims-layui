package pub.zgq.service;

import pub.zgq.pojo.Dormitory;

import java.util.List;

public interface DormitoryService {
    List<Dormitory> findAll(Dormitory dormitory);

    boolean addDorm(Dormitory dormitory);

    void updateDorm(Dormitory dormitory);

    void delDorm(String sid);

}
