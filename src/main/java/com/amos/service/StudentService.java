package com.amos.service;

import com.amos.pojo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface StudentService {
    Student login(String username);

    String ajaxUploadExcel(HttpServletRequest request, HttpServletResponse response);

    List<Student> byClass(String classname);

    void deleteStudent(String num);

    void upStudent(Student student);

    Student selectByPrimaryKey(Long id);

    void creatStudent(Student student);

    Student byNum(String num);

    void updateStudent(Student student);

    List<Student> allStudent(List<Long> longList);

}
