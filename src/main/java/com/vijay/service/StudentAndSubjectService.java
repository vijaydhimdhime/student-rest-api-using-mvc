package com.vijay.service;

import java.util.List;


import com.vijay.entity.Student;
import com.vijay.entity.Subject;


public interface StudentAndSubjectService {
	
	public boolean saveStudent(Student std);
	
	public List<Student> getStudents();
	
	public Student getstudent(int id);
	
	public List<Subject> getsubjects();

	public Subject getsub(int id);


}