package com.vijay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.dao.StudentAndSubjectDao;
import com.vijay.entity.Student;
import com.vijay.entity.Subject;

@Service
public class StudentAndSubjectServiceImplementation implements StudentAndSubjectService{
	
	@Autowired
	StudentAndSubjectDao studentAndsubjectDao;

	@Override
	public boolean saveStudent(Student std) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getstudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getsubjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject getsub(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}


