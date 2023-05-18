package com.trigyn.librarymanagement.controller;


import com.trigyn.librarymanagement.model.DepartmentVO;

import com.trigyn.librarymanagement.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController

public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/dept")
    List<DepartmentVO> getDept(){

        return deptService.getAll();

    }


    @PostMapping("/dept")

    Boolean createDept(@RequestBody DepartmentVO departmentVO){

        return deptService.createDept(departmentVO);

    }

}

