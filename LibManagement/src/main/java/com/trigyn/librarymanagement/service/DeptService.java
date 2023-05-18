package com.trigyn.librarymanagement.service;
import com.trigyn.librarymanagement.entity.Dept;

import com.trigyn.librarymanagement.entity.Student;

import com.trigyn.librarymanagement.model.DepartmentVO;

import com.trigyn.librarymanagement.model.StudentVO;

import com.trigyn.librarymanagement.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.ArrayList;

import java.util.List;


@Service

public class DeptService {


    @Autowired

    DepartmentRepository departmentRepository;

    private Dept convertVO(DepartmentVO departmentVO) {

        Dept dept = new Dept();

        dept.setId(departmentVO.getId());

        dept.setDeptName(departmentVO.getDepartmentName());

// dept.setStudents(departmentVO.getStudents());

        return dept;

    }


    public Boolean createDept(DepartmentVO departmentVO) {

        Dept dept = convertVO(departmentVO);

        try {

            departmentRepository.save(dept);

        } catch (Exception exception) {

            return false;

        }

        return true;

    }

    private List<StudentVO> convertStudents(List<Student> students){

        List<StudentVO> studentVOS = new ArrayList<>();

        for(Student student : students){

            StudentVO studentVO = new StudentVO();

            studentVO.setId(student.getId());

            studentVO.setAge(student.getAge());

            studentVO.setName(student.getName());

            studentVOS.add(studentVO);

        }

        return studentVOS;

    }

    private DepartmentVO convertEntity(Dept dept) {

        DepartmentVO departmentVO = new DepartmentVO();

        departmentVO.setId(dept.getId());

        departmentVO.setDepartmentName(dept.getDeptName());

        departmentVO.setStudents(convertStudents(dept.getStudents()));

        return departmentVO;

    }


    public List<DepartmentVO> getAll(){

        List<DepartmentVO> departmentList = new ArrayList<>();

        for(Dept dept : departmentRepository.findAll()){

            departmentList.add(convertEntity(dept));

        }

        return departmentList;

    }


}

