package com.amos.service.impl;

import com.amos.dao.TeacherMapper;
import com.amos.pojo.Teacher;
import com.amos.service.TeacherSercice;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Amos
 */
public class TeacherServiceImpl  implements TeacherSercice {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Teacher login(String username) {
        return teacherMapper.login(username);
    }

    /**
     * 估计接口功能会与预期不一样，后期修复ing
     * @param chkValue
     */
    @Override
    public void deleteManyTeacher(String chkValue) {
        teacherMapper.deleteManyTeacher(chkValue);
    }

    @Override
    public void upTeacher(Teacher teacher) {
        teacherMapper.upTeacher(teacher);
    }
}
