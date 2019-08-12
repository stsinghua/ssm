package cn.stsinghua.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 这是用户登录的JavaBean
 * @author stsinghua
 * @date 18-4-7下午7:28
 */
@Slf4j
@Getter
@Setter
@ToString
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户登录名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
}
