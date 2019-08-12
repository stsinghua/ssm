package cn.stsinghua.mapper;

import cn.stsinghua.pojo.Customer;
import com.github.pagehelper.Page;

/**
 * @author stsinghua
 * @date 18-4-14下午9:14
 */
public interface CustomerMapper {

    void create(Customer customer);

    void delete(int id);

    Customer findById(int id);

    void update(Customer customer);

    Page<Customer> findByPage(Customer customer);
}
