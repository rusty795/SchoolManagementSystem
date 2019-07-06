package com.learn.app.jpa;

import com.learn.app.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepo extends JpaRepository<StudentEntity,Integer> {
}
