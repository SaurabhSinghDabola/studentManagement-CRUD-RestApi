package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Model.Student;
import com.student.Service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/students")

public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id){
		Student student = studentService.getStudent(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent( @RequestBody Student student){
		    Student saveStudent = studentService.addStudent(student);
		    return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
		}
	
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudent(){
		 List<Student> students = studentService.getAllStudents();
		 return ResponseEntity.ok(students);
		 }
	
    @PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable int id){
		  Student updatedStudent = studentService.updateStudent(student, id);
		 
		return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
		
	} 
     @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
    	studentService.deleteStudent(id);
    	return ResponseEntity.ok("student deleted sucessfully..");
    			
    }
    
    
}
