package pub.zgq.service;


import pub.zgq.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 判断用户是否存在
     */
    public User findUser(User user);

    List<User> findAll();

}
