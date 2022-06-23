package pub.zgq.dao;

import org.springframework.stereotype.Repository;
import pub.zgq.pojo.User;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 登录
     */
    public User findUser(User user);

    List<User> findAll();

}
