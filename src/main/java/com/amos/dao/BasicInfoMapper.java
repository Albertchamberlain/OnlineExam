package com.amos.dao;

import com.amos.pojo.BasicInfo.*;
import com.amos.pojo.BasicInfo.Class;
import com.amos.pojo.Student;

import java.util.List;

/**
 * @author Amos
 */
public interface BasicInfoMapper {
        List<Semester> findAll();

        List<Major>findMaAll(Long seid);

        List<Class>findCiAll(Long maid);

        void createSemester(Semester semester);

        void createMajor(Major major);

        void createBlass(Class aClass);

        void createStudent(Student student);

        void upSemester(Semester semester);

        void upMajor(Major major);

        void  upBlass(Class aClass);

        List<Student>findClass(String classname);

        Integer deleteManySemster(int [] id_arr);


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
