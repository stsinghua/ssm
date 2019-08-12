package cn.stsinghua.mapper;

import cn.stsinghua.pojo.User;

/**
 * @author stsinghua
 * @date 18-4-7下午9:10
 */
public interface UserMapper {

    User login(String username);
}
