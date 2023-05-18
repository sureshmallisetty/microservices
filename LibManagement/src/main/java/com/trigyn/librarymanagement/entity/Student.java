package com.trigyn.librarymanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Student {

    @Id
    private Long id;
    @Column(name="student_name")
    private String name;

    @Column
    private Integer age;

    @ManyToOne

    Dept dept;


    public Long getId() {

        return id;

    }


    public void setId(Long id) {

        this.id = id;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public Integer getAge() {

        return age;

    }


    public void setAge(Integer age) {

        this.age = age;

    }


    public Dept getDept() {

        return dept;

    }


    public void setDept(Dept dept) {

        this.dept = dept;

    }


    @Override

    public String toString() {

        return "Student{" +

                "id=" + id +

                ", name='" + name + '\'' +

                ", age=" + age +

                '}';

    }

}

