package cn.stsinghua.service;

import cn.stsinghua.pojo.Customer;
import cn.stsinghua.pojo.PageBean;

/**
 * @author stsinghua
 * @date 18-4-14下午9:13
 */
public interface CustomerService extends BaseService<Customer> {

    /**
     * 分页查询
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Customer customer, int pageCode, int pageSize);

}
