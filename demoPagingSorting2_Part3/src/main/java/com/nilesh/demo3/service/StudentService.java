package com.nilesh.demo3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nilesh.demo3.model.Student;
import com.nilesh.demo3.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> findPaginated(int pageNo, int pageSize) {
		Pageable paging=PageRequest.of(pageNo, pageSize) ;
		Page<Student> pagedResult = repository.findAll(paging);
		return pagedResult.toList();
	}
	
}
