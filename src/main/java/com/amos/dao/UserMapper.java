package com.amos.dao;

import com.amos.pojo.Point1;
import com.amos.pojo.Point2;
import com.amos.pojo.Teacher;
import com.amos.pojo.Tk.Choice;
import com.amos.pojo.Tk.ReadProgram;
import com.amos.pojo.User;
import javafx.scene.control.ChoiceBox;

import java.util.List;

public interface UserMapper {
    void creatAdmin(User user);
    void updateUser(User user);
    User login(String username);
     void create(Teacher teacher);
     void delete(Long id);
     void update(Teacher teacher);
     Teacher findById(Long id);
     List<Teacher> findTeacherAll();
     List<Point1> findPoint1All();
     void createPoint1(Point1 point1);
     void createPoint2(Point2 point2);
     void deleteP1(Long id);
     void deletePP1(Long id);
     void deleteP2(String chaptertwo);
     List<Point1> point1All();
     void createChoice(Choice choice);
     Choice findByChId(Long id);
     List<Choice> findChoiceAll();
     void updateCh(Choice choice);
     void deleteCh(Long id);
     List<ReadProgram> findReadProgramAll();
     User findUserName(String username);
     void deleteManyChoice(String chkValue);

}
