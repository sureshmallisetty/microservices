package com.trigyn.librarymanagement.service;

import com.trigyn.librarymanagement.entity.Dept;
import com.trigyn.librarymanagement.entity.Student;
import com.trigyn.librarymanagement.model.StudentVO;
import com.trigyn.librarymanagement.repository.DepartmentRepository;
import com.trigyn.librarymanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    DepartmentRepository departmentRepository;


    private Student convertVO(StudentVO studentVO) {
        Student student = new Student();
        student.setId(studentVO.getId());
        student.setAge(studentVO.getAge());
        student.setName(studentVO.getName());
        Dept dept = null;
        if(studentVO.getDeptID()!= null){
            dept = departmentRepository.findById(studentVO.getDeptID()).get();
            student.setDept(dept);
        }
        return student;
    }

    public Boolean createStudent(StudentVO studentVO) {
        Student student = convertVO(studentVO);
        try {
            studentRepository.save(student);
        } catch (Exception exception) {
            return false;
        }
        return true;
    }

    private StudentVO convertEntity(Student student) {
        StudentVO studentVO = new StudentVO();
        studentVO.setId(student.getId());
        studentVO.setAge(student.getAge());
        studentVO.setName(student.getName());
        if(student.getDept()!=null){
            studentVO.setDeptID(student.getDept().getId());
        }
        return studentVO;
    }

    public List<StudentVO> getAll(){
        List<StudentVO> studentList = new ArrayList<>();
        for(Student student : studentRepository.findAll()){
            studentList.add(convertEntity(student));
        }
        return studentList;
    }

    public List<StudentVO> findStudentByName(String name){
        List<StudentVO> studentList = new ArrayList<>();
        for(Student student : studentRepository.findStudentByName(name)){
            studentList.add(convertEntity(student));
        }
        return studentList;
    }

    public List<StudentVO> getStudentByName(String name){
        List<StudentVO> studentList = new ArrayList<>();
        for(Student student : studentRepository.findStudentBySname("%" + name + "%")){
            studentList.add(convertEntity(student));
        }
        return studentList;
    }

    public List<StudentVO> getStudentByNameNative(String name){
        List<StudentVO> studentList = new ArrayList<>();
        for(Student student : studentRepository.findStudentBySnameNative("%" + name + "%")){
            studentList.add(convertEntity(student));
        }
        return studentList;
    }

    public List<StudentVO> getStudentByDept(Long id){
        List<StudentVO> studentList = new ArrayList<>();
        for(Student student : studentRepository.findStudentByDept(id)){
            studentList.add(convertEntity(student));
        }
        return studentList;
    }
}