package com.amos.service;

import com.amos.pojo.Teacher;

public interface TeacherSercice {
    Teacher login(String username);

    void deleteManyTeacher(String chkValue);

    void upTeacher(Teacher teacher);
}
