package pub.zgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zgq.dao.UserDao;
import pub.zgq.pojo.User;
import pub.zgq.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(User user) {
        User u = userDao.findUser(user);
        return u;
    }

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }
}
