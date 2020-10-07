package com.amos.service;

import com.amos.pojo.Point1;
import com.amos.pojo.Point2;
import com.amos.pojo.Teacher;
import com.amos.pojo.Tk.Choice;
import com.amos.pojo.Tk.ReadProgram;
import com.amos.pojo.User;

import java.util.List;

public interface UserService  extends BaseService<User>{
    void updateuser(User user);

    void createAdmin(User user);

    User login(String username);

    List<Teacher> findTeacherAll();

    void update(Teacher teacher);

    void create(Teacher teacher);

    List<Point1> findPoint1All();

    void createPoint1(Point1 point1);

    void createPoint2(Point2 point2);

    void deleteP1(Long id);

    void deletePP1(Long id);

    void deleteP2(String chaptertwo);

    List<Point1> point1All();

    List<Choice> findChoiceAll();

    void createChoiceAll();

    Choice findByChID(Long id);

    Teacher findById(Long id);

    void updateCh(Choice choice );

    void deleteCh(Long id);

    List<ReadProgram> findReadProgramAll();

    User findByUserName(String username);

    void deleteManyChoice(String chkValue);


}
