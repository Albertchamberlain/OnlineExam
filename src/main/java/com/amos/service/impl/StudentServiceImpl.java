package com.amos.service.impl;

import com.amos.dao.SutdentMapper;
import com.amos.pojo.Student;
import com.amos.service.ExamService;
import com.amos.service.StudentService;
import com.amos.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

/**
 * @author Amos
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    private SutdentMapper sutdentMapper;


    @Override
    public Student login(String username) {
        return sutdentMapper.login(username);
    }

    @Override
    public String ajaxUploadExcel(HttpServletRequest request, HttpServletResponse response) {
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;

        MultipartFile file =multipartHttpServletRequest.getFile("file");

        if(file.isEmpty())
        {
            try{
                throw new Exception("文件不存在!");
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        InputStream in = null;
        try{
            in = file.getInputStream();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        List<List<Object>> lists = null;
        try{
            lists = new ExcelUtils().getBankListByExcel(in,file.getOriginalFilename());
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i <lists.size(); i++) {
            List<Object>  objectList = lists.get(i);
            final Student student = new Student();
            Student j = null;

            try
            {
                j = sutdentMapper.selectByPrimerKey(Long.valueOf(String.valueOf(objectList.get(0))));
            }catch (NumberFormatException e)
            {

            }
            student.setUsername(String.valueOf(objectList.get(0)));
            String password = String.valueOf(objectList.get(2));

            student.setPassword(password);
            student.setClassname(String.valueOf(objectList.get(1)));
            student.setNum(String.valueOf(objectList.get(2)));
            if (j  == null)
            {
                sutdentMapper.insert(student);
            }
            else
            {
                sutdentMapper.updateByPrimerKey(student);
            }
        }
        return "success";
    }

    @Override
    public List<Student> byClass(String classname) {
        return sutdentMapper.byClass(classname);
    }

    @Override
    public void deleteStudent(String num) {
        sutdentMapper.deleteStudent(num);
    }

    @Override
    public void upStudent(Student student) {
        sutdentMapper.upStudent(student);
    }

    @Override
    public Student selectByPrimaryKey(Long id) {
        return sutdentMapper.selectByPrimerKey(id);
    }

    @Override
    public void creatStudent(Student student) {
        sutdentMapper.creatStudent(student);
    }

    @Override
    public Student byNum(String num) {
        return sutdentMapper.byNum(num);
    }

    @Override
    public void updateStudent(Student student) {
        sutdentMapper.updateStudent(student);
    }

    @Override
    public List<Student> allStudent(List<Long> longList) {
        return sutdentMapper.allStudent(longList);
    }
}
