package com.trigyn.librarymanagement.controller;

import com.trigyn.librarymanagement.model.StudentVO;
import com.trigyn.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    List<StudentVO> getStudent(@RequestParam (required = false) String name) {
        if (name != null)
            return studentService.findStudentByName(name);
        else
            return studentService.getAll();
    }

    @GetMapping("/getstudentbyname")
    List<StudentVO> getStudentByName(@RequestParam (required = false) String name) {
        if (name != null)
            return studentService.getStudentByName(name);
        else
            return studentService.getAll();
    }

    @GetMapping("/getstudentbynamenative")
    List<StudentVO> getStudentByNameNative(@RequestParam (required = false) String name) {
        if (name != null)
            return studentService.getStudentByNameNative(name);
        else
            return studentService.getAll();
    }

    @GetMapping("/getstudentbydeptid")
    List<StudentVO> getStudentByDeptId(@RequestParam (required = false) Long id) {
        if (id != null)
            return studentService.getStudentByDept(id);
        else
            return studentService.getAll();
    }

    @PostMapping("/student")
    Boolean createStudent(@RequestBody StudentVO studentVO){
        return studentService.createStudent(studentVO);
    }
}