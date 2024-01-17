package com.student.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.Exception.ResourceNotFoundException;
import com.student.Model.Student;
import com.student.Repository.StudentRepo;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private StudentRepo studentRepo;
	
	@Override
	public Student addStudent(Student student) {
	         Student saveStudent =  studentRepo.save(student);	
		     return saveStudent;
	}

	@Override
	public Student getStudent(int id) {
		Student student = studentRepo.findById(id)
				           .orElseThrow(()-> new ResourceNotFoundException("student not exist with id" + id));
		return student;
				           
	
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = studentRepo.findAll();
		return students;
	}

	@Override
	public Student updateStudent(Student student, int id) {
		    Student updateStudent = studentRepo.findById(id)
		    		.orElseThrow(()-> new ResourceNotFoundException(" student not exist with id" + id ));
		    updateStudent.setName(student.getName());
		    updateStudent.setEmail(student.getEmail());
		    updateStudent.setCourse(student.getCourse());
		    
		  Student updatedStudent =   studentRepo.save(updateStudent);
		  return updatedStudent;
	}

	@Override
	public void deleteStudent(int id) {
	Student student = 	studentRepo.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException ("student not exist with id " + id));
		studentRepo.deleteById(id);
		
	}
	

}
