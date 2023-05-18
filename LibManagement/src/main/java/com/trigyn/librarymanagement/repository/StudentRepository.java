package com.trigyn.librarymanagement.repository;

import com.trigyn.librarymanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findStudentByName(String name);

    @Query("Select s from Student s where s.name like :sName")
    List<Student> findStudentBySname(String sName);

    @Query(value = "Select * from Student where student_name like :sName", nativeQuery = true)
    List<Student> findStudentBySnameNative(String sName);

    @Query("Select s from Student s where s.dept.id = :id")
    List<Student> findStudentByDept(Long id);

}