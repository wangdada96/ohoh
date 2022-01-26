package com.zhisheng.ssmtest.controller;

import com.zhisheng.ssmtest.bean.Teacher;
import com.zhisheng.ssmtest.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/getTeacher")
    public String getTeacher(@RequestParam(value="id",defaultValue = "1") Integer id, Model model){
          Teacher t = teacherService.getTeacher(id);
          model.addAttribute("teacher",t);
          return "success";
    }
    @RequestMapping("/haha")
    public String test(){
        return "test";
    }
}
