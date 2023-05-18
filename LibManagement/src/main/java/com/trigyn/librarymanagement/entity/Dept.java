package com.trigyn.librarymanagement.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import java.util.List;


@Entity

public class Dept {

    @Id

    Long id;

    @Column(name="dept_name")

    String deptName;

    @OneToMany(mappedBy = "dept")

    List<Student> students;


    public Long getId() {

        return id;

    }


    public void setId(Long id) {

        this.id = id;

    }


    public String getDeptName() {

        return deptName;

    }


    public void setDeptName(String deptName) {

        this.deptName = deptName;

    }


    public List<Student> getStudents() {

        return students;

    }


    public void setStudents(List<Student> students) {

        this.students = students;

    }


    @Override

    public String toString() {

        return "Dept{" +

                "id=" + id +

                ", deptName='" + deptName + '\'' +

                ", students=" + students +

                '}';

    }

}
