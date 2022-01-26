package com.zhisheng.ssmtest.service;

import com.zhisheng.ssmtest.bean.Teacher;
import com.zhisheng.ssmtest.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public Teacher getTeacher(Integer id){
        return teacherDao.getTeacherById(id);
    }
}
