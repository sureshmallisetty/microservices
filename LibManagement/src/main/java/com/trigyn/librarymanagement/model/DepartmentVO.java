package com.trigyn.librarymanagement.model;


import java.util.List;


public class DepartmentVO {


    Long id;

    String departmentName;


    List<StudentVO> students;


    public Long getId() {

        return id;

    }


    public void setId(Long id) {

        this.id = id;

    }


    public String getDepartmentName() {

        return departmentName;

    }


    public void setDepartmentName(String departmentName) {

        this.departmentName = departmentName;

    }


    public List<StudentVO> getStudents() {

        return students;

    }


    public void setStudents(List<StudentVO> students) {

        this.students = students;

    }


    @Override

    public String toString() {

        return "DepartmentVO{" +

                "id=" + id +

                ", departmentName='" + departmentName + '\'' +

                ", students=" + students +

                '}';

    }

}

