package com.amos.dao;

import com.amos.pojo.Student;

import java.util.List;

/**
 * @author Amos
 */
public interface SutdentMapper {
    Student login (String username);
    void deleteStudent(String num);
    int insert(Student student);
    int insertSelective(Student record);
    Student selectByPrimerKey(Long id);
    int updateByPrimerKeySelective(Student recrord);
    int updateByPrimerKey(Student record);

    void  insertInfoBatch(List<Student> list);
    void upStudent(Student student);
    List<Student> byClass(String classname);
    void creatStudent(Student student);
    Student byNum(String num);
    void updateStudent(Student student);
    List<Student> allStudent(List<Long> longList);


}
