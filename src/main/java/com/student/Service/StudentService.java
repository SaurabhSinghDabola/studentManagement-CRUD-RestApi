package com.student.Service;

import java.util.List;

import com.student.Model.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student getStudent(int id);
	
	List<Student> getAllStudents();
	
	Student updateStudent(Student student , int id);
	
	void deleteStudent(int id );
	
	

}
