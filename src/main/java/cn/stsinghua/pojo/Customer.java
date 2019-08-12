package cn.stsinghua.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 客户信息的JavaBean
 *
 * @author stsinghua
 * @date 18-4-7下午7:27
 */
@Slf4j
@Getter
@Setter
@ToString
public class Customer  extends BaseModel {

    private static final long serialVersionUID = 1L;
    /**
     * 客户的id
     */
    private int id;
    /**
     * 客户的姓名
     */
    private String name;
    /**
     * 客户的电话
     */
    private String telephone;
    /**
     * 客户的住址
     */
    private String address;
    /**
     * 客户备注
     */
    private String remark;

}
