package com.student.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Model.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {

}
