package com.amos.service.impl;

import com.amos.dao.CustomerMapper;
import com.amos.pojo.Customer;
import com.amos.pojo.PageBean;
import com.amos.service.CustomerService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Amos
 */
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 分页
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    @Override
    public PageBean findByPage(Customer customer, int pageCode, int pageSize) {

        PageHelper.startPage(pageCode,pageSize);

        Page<Customer> page =customerMapper.findByPage(customer);
        return new PageBean(pageCode,(int)Math.ceil((double)page.getTotal() / (double)pageSize), (int)page.getTotal(), pageSize,page.getResult());
    }

    @Override
    public Customer findById(Long id) {
        return customerMapper.findById(id);
    }

    /**
     *冗余，未实现
     * @return
     */
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void create(Customer customer) {
        customerMapper.create(customer);
    }

    @Override
    public void delete(Long id) {
            customerMapper.delete(id);
    }

    @Override
    public void update(Customer customer) {
            customerMapper.upDate(customer);
    }
}
