package com.amos.service.impl;

import com.amos.dao.BasicInfoMapper;
import com.amos.pojo.BasicInfo.*;
import com.amos.pojo.BasicInfo.Class;
import com.amos.pojo.Student;
import com.amos.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BasicInfoImpl implements BasicInfoService {

    @Autowired
    private BasicInfoMapper basicInfoMapper;


    @Override
    public List<Semester> findAll() {
        return basicInfoMapper.findAll();
    }

    @Override
    public List<Major> findMaAll(Long seid) {
        return basicInfoMapper.findMaAll(seid);
    }

    @Override
    public List<Class> findCiAll(Long maid) {
        return basicInfoMapper.findCiAll(maid);
    }

    @Override
    public void createSemester(Semester semester) {
            basicInfoMapper.createSemester(semester);
    }

    @Override
    public Integer deleteSemeste(int[] id_arr) {
        return basicInfoMapper.deleteManySemster(id_arr);
    }

    @Override
    public void createMajor(Major major) {
         basicInfoMapper.createMajor(major);
    }

    @Override
    public void createBlass(Class aclass) {
        basicInfoMapper.createBlass(aclass);
    }

    @Override
    public void upSemester(Semester semester) {
        basicInfoMapper.upSemester(semester);
    }

    @Override
    public void upMajor(Major major) {
        basicInfoMapper.upMajor(major);
    }

    @Override
    public void upBlass(Class aclass) {
        basicInfoMapper.createBlass(aclass);
    }

    @Override
    public void createStudent(Student student) {
        basicInfoMapper.createStudent(student);
    }

    @Override
    public List<Student> findClass(String classname) {
        return basicInfoMapper.findClass(classname);
    }

    @Override
    public void deleteClass(String cname) {
        basicInfoMapper.deleteClass(cname);
    }

    @Override
    public void deleteMajor(Long maid) {
        basicInfoMapper.deleteMajor(maid);
    }

    @Override
    public void deleteYear(Long seid) {
        basicInfoMapper.deleteYear(seid);
    }

    @Override
    public List<Depart> allDepart() {
        return basicInfoMapper.allDepart();
    }

    @Override
    public void insertDepart(Depart depart) {
        basicInfoMapper.insertDepart(depart);
    }

    @Override
    public void deleteDepart(int id) {
        basicInfoMapper.deleteDepart(id);
    }

    @Override
    public void updateDepart(Depart depart) {
        basicInfoMapper.updateDepart(depart);
    }

    @Override
    public List<Sit> allSit() {
        return basicInfoMapper.allSit();
    }

    @Override
    public void insertSit(Sit sit) {
        basicInfoMapper.insertSit(sit);
    }

    @Override
    public void deleteSit(int id) {
        basicInfoMapper.deleteSit(id);
    }

    @Override
    public void updateSit(Sit sit) {
        basicInfoMapper.updateSit(sit);
    }
}
