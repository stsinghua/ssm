package cn.stsinghua.service;

import cn.stsinghua.pojo.User;

/**
 * @author stsinghua
 * @date 18-4-7下午9:09
 */
public interface UserService extends BaseService<User> {

    User login(String username);
}
