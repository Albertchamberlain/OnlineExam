package com.amos.service.impl;

import com.amos.dao.UserMapper;
import com.amos.pojo.Point1;
import com.amos.pojo.Point2;
import com.amos.pojo.Teacher;
import com.amos.pojo.Tk.Choice;
import com.amos.pojo.Tk.ReadProgram;
import com.amos.pojo.User;
import com.amos.service.UserService;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Amos
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void updateuser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void createAdmin(User user) {
        userMapper.creatAdmin(user);
    }

    @Override
    public User login(String username) {
        return userMapper.login(username);
    }

    @Override
    public List<Teacher> findTeacherAll() {
        return userMapper.findTeacherAll();
    }

    @Override
    public void update(Teacher teacher) {
        userMapper.update(teacher);
    }

    @Override
    public void create(Teacher teacher) {
        userMapper.create(teacher);
    }

    @Override
    public List<Point1> findPoint1All() {
        return userMapper.findPoint1All();
    }

    @Override
    public void createPoint1(Point1 point1) {
        userMapper.createPoint1(point1);
    }

    @Override
    public void createPoint2(Point2 point2) {
        userMapper.createPoint2(point2);
    }

    @Override
    public void deleteP1(Long id) {
        userMapper.deleteP1(id);
    }

    @Override
    public void deletePP1(Long id) {
        userMapper.deletePP1(id);
    }

    @Override
    public void deleteP2(String chaptertwo) {
        userMapper.deleteP2(chaptertwo);
    }

    @Override
    public List<Point1> point1All() {
        return userMapper.point1All();
    }

    @Override
    public List<Choice> findChoiceAll() {
        List<Choice> choices = userMapper.findChoiceAll();
        for (int i= 0;  i< choices.size(); i++) {
            String s = StringEscapeUtils.escapeHtml4(choices.get(i).getContent());
            choices.get(i).setContent(s);
        }
        return choices;
    }

    @Override
    public void createChoiceAll() {
    }

    @Override
    public Choice findByChID(Long id) {
        return userMapper.findByChId(id);
    }

    @Override
    public Teacher findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void updateCh(Choice choice) {
        userMapper.updateCh(choice);
    }

    @Override
    public void deleteCh(Long id) {
        userMapper.deleteCh(id);
    }

    @Override
    public List<ReadProgram> findReadProgramAll() {
        List<ReadProgram> readPrograms =userMapper.findReadProgramAll();
        for (int i = 0; i <readPrograms.size() ; i++) {
            String s = StringEscapeUtils.escapeHtml4(readPrograms.get(i).getContent());
            readPrograms.get(i).setContent(s);
        }
        return readPrograms;
    }

    @Override
    public User findByUserName(String username) {
        return userMapper.findUserName(username);
    }

    @Override
    public void deleteManyChoice(String chkValue) {
        userMapper.deleteManyChoice(chkValue);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateUser(user);
    }
}
