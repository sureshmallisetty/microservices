package com.trigyn.librarymanagement.repository;

import com.trigyn.librarymanagement.entity.Dept;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository

public interface DepartmentRepository extends JpaRepository<Dept, Long> {

}
