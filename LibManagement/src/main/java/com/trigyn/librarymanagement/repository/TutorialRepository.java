package com.trigyn.librarymanagement.repository;

import com.trigyn.librarymanagement.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}

