package com.amos.dao;

import com.amos.pojo.Customer;
import com.github.pagehelper.Page;

/**
 * @author Amos
 */
public interface CustomerMapper {
        void create(Customer customer);
        void delete(long id);
        Customer findById(Long id);
        void upDate(Customer customer);

        Page<Customer> findByPage(Customer customer);
}
