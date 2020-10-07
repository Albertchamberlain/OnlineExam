package com.amos.dao;

import com.amos.pojo.Teacher;

/**
 * @author Amos
 */
public interface TeacherMapper {
    Teacher login  (String username);
    void update(Teacher teacher);
    void deleteManyTeacher(String chkValue);
    void upTeacher(Teacher teacher);
}
