package com.nilesh.demo3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nilesh.demo3.model.Student;

@Service
public interface IStudentService {
	List<Student> findPaginated(int pageNo,int pageSize);
}
