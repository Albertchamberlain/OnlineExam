package com.amos.service;

import java.util.List;

public interface BaseService<T> {
    /**
     * findAll
     * @return
     */
    List<T> findAll();

    /**
     * create
     * @param t
     */
    void create(T t);

    /**
     * delete
     * @param id
     */
    void delete(Long id);

    /**
     * update
     * @param t
     */
    void update(T t);

}
