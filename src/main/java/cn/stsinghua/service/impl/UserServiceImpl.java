package cn.stsinghua.service.impl;

import cn.stsinghua.mapper.UserMapper;
import cn.stsinghua.pojo.User;
import cn.stsinghua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author stsinghua
 * @date 18-4-7下午9:09
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 注入
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录的方法
     */
    public User login(String username) {
        return userMapper.login(username);
    }

    public List<User> findAll() {
        return null;
    }

    public User findById(int id) {
        return null;
    }

    public void create(User user) {

    }

    public void delete(int id) {

    }

    public void update(User user) {

    }
}
