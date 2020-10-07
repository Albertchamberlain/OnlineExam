package com.amos.service;

import com.amos.pojo.BasicInfo.*;
import com.amos.pojo.BasicInfo.Class;
import com.amos.pojo.Student;

import java.util.List;

public interface BasicInfoService {
    List<Semester> findAll();

    List<Major> findMaAll(Long seid);

    List<Class> findCiAll(Long maid);

    void  createSemester(Semester semester);

    Integer deleteSemeste(int[] id_arr);

    void createMajor(Major major);

    void createBlass(Class aclass);

    void upSemester(Semester semester);

    void upMajor(Major major);

    void upBlass(Class aclass);

    void createStudent(Student student);

    List<Student> findClass(String  classname);

    void deleteClass(String cname);

    void deleteMajor(Long maid);

    void deleteYear(Long seid);

    List<Depart> allDepart();

    void insertDepart(Depart depart);

    void deleteDepart(int id);

    void updateDepart(Depart depart);

    List<Sit> allSit();

    void insertSit(Sit sit);

    void deleteSit(int id);

    void updateSit(Sit sit);
}
