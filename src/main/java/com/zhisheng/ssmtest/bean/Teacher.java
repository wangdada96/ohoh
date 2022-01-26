package com.zhisheng.ssmtest.bean;

import java.util.Date;

public class Teacher {
    private Integer id;
    private String name;
    private String Course;
    private String address;
    private Date date;

    public Teacher() {
    }

    public Teacher(Integer id, String name, String course, String address, Date date) {
        this.id = id;
        this.name = name;
        Course = course;
        this.address = address;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Course='" + Course + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
